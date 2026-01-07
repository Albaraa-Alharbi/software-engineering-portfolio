package lab4.weatherapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherActivity extends AppCompatActivity {

    TextView tvLocation, tvTemp, tvHumidity, tvWind, tvDescription;
    ImageView ivWeatherIcon;
    Button btnBack;

    private final String API_KEY = "5e5d0245e917ef8b521e8e1b0d3008c5"; // API KEY

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        tvLocation = findViewById(R.id.tvLocation);
        tvTemp = findViewById(R.id.tvTemp);
        tvHumidity = findViewById(R.id.tvHumidity);
        tvWind = findViewById(R.id.tvWind);
        tvDescription = findViewById(R.id.tvDescription);
        ivWeatherIcon = findViewById(R.id.ivWeatherIcon);
        btnBack = findViewById(R.id.btnBack);

        String city = getIntent().getStringExtra("city");
        boolean isFahrenheit = getIntent().getBooleanExtra("isFahrenheit", false);

        tvLocation.setText(city);
        btnBack.setOnClickListener(v -> finish());

        new FetchWeatherTask().execute(city + "|" + (isFahrenheit ? "imperial" : "metric"));
    }

    private class FetchWeatherTask extends AsyncTask<String, Void, String> {
        String units = "metric";

        @Override
        protected String doInBackground(String... params) {
            try {
                String[] p = params[0].split("\\|");
                String city = p[0];
                units = p[1];

                String urlString = "https://api.openweathermap.org/data/2.5/weather?q="
                        + java.net.URLEncoder.encode(city, "UTF-8")
                        + "&appid=" + API_KEY
                        + "&units=" + units;

                URL url = new URL(urlString);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();

                int responseCode = conn.getResponseCode();
                if (responseCode != HttpURLConnection.HTTP_OK) {
                    return null;
                }

                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) sb.append(line);
                br.close();
                conn.disconnect();
                return sb.toString();

            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(String jsonString) {
            if (jsonString == null) {
                Toast.makeText(WeatherActivity.this, "Error fetching weather data", Toast.LENGTH_SHORT).show();
                return;
            }
            try {
                JSONObject obj = new JSONObject(jsonString);
                JSONObject main = obj.getJSONObject("main");
                double temp = main.getDouble("temp");
                int humidity = main.getInt("humidity");
                JSONObject wind = obj.getJSONObject("wind");
                double windSpeed = wind.getDouble("speed");

                JSONArray weatherArr = obj.getJSONArray("weather");
                JSONObject weather = weatherArr.getJSONObject(0);
                String description = weather.getString("description");
                String mainWeather = weather.getString("main").toLowerCase();

                String unitSymbol = units.equals("metric") ? "°C" : "°F";

                tvTemp.setText(String.format("Temperatur: %.1f %s", temp, unitSymbol));
                tvHumidity.setText("Humidity: " + humidity + " %");
                tvWind.setText(String.format("Wind Speed: %.1f m/s", windSpeed));
                tvDescription.setText(description);

                if (mainWeather.contains("cloud")) ivWeatherIcon.setImageResource(R.drawable.cloud);
                else if (mainWeather.contains("rain") || mainWeather.contains("drizzle")) ivWeatherIcon.setImageResource(R.drawable.rain);
                else if (mainWeather.contains("snow")) ivWeatherIcon.setImageResource(R.drawable.snow);
                else if (mainWeather.contains("mist") || mainWeather.contains("fog") || mainWeather.contains("haze"))
                    ivWeatherIcon.setImageResource(R.drawable.mist);
                else ivWeatherIcon.setImageResource(R.drawable.sun);

            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(WeatherActivity.this, "Error parsing weather data", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
