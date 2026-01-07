package findu_university.assignment1;

//import the needed packages
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
//Main Activity class
public class MainActivity extends AppCompatActivity {

    //initiating the string (null)
    private String currentUrl = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //ifClick is a methode that handles the action and the methode's behaviour
    public void ifClick(View view) {
        //components listeners (Spinner, ImageView)
        Spinner spinner = findViewById(R.id.ItemsList);
        ImageView imageV = findViewById(R.id.uniLable);
        imageV.setOnClickListener(new View.OnClickListener() {
            @Override
            //onClick methode handles the "Click" action and it's outcome
            public void onClick(View v) {
                if (currentUrl != null) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(currentUrl));
                    startActivity(intent);
                }
            }
        });
        //this section tell the app what to do if a certain item is selected from the spinner
        String uniChoice = spinner.getSelectedItem().toString();
        if (uniChoice.equals("University of Jeddah")) {
            imageV.setImageResource(R.drawable.uj);
            currentUrl = "https://www.uj.edu.sa";
        }
        else if (uniChoice.equals("King Abdulaziz University")) {
            imageV.setImageResource(R.drawable.kau);
            currentUrl = "https://www.kau.edu.sa";
        }
        else if (uniChoice.equals("Taibah University")) {
            imageV.setImageResource(R.drawable.tu);
            currentUrl = "https://www.taibahu.edu.sa";
        }
        //setting the visibility to visible after the statement is satisfied
        imageV.setVisibility(View.VISIBLE);
    }
}