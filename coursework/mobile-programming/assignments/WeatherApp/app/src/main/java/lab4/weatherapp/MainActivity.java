package lab4.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etCity;
    Button btnCheck;
    Switch switchUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCity = findViewById(R.id.etCity);
        btnCheck = findViewById(R.id.btnCheck);
        switchUnit = findViewById(R.id.switchUnit);

        btnCheck.setOnClickListener(v -> {
        String city = etCity.getText().toString().trim();
        if (city.isEmpty()) {
            Toast.makeText(this, "الرجاء إدخال اسم المدينة", Toast.LENGTH_SHORT).show();
            return;
        }
        boolean isFahrenheit = switchUnit.isChecked();
        Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
        intent.putExtra("city", city);
        intent.putExtra("isFahrenheit", isFahrenheit);
        startActivity(intent);
    });
    }
}
