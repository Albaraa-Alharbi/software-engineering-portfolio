package malefemale.lab4;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.content.SharedPreferences;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText editName, editDate;
    RadioGroup groupGender;
    RadioButton rbMale, rbFemale;
    Button btnSave, btnClear;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.editName);
        editDate = findViewById(R.id.editDate);
        groupGender = findViewById(R.id.groupGender);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        btnSave = findViewById(R.id.btnSave);
        btnClear = findViewById(R.id.btnClear);

        sp = getSharedPreferences("prefs", MODE_PRIVATE);
        load();

        editDate.setOnClickListener(v -> showDate());

        btnSave.setOnClickListener(v -> save());

        btnClear.setOnClickListener(v -> {
            sp.edit().clear().apply();
            editName.setText("");
            editDate.setText("");
            groupGender.clearCheck();
            Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show();
        });
    }

    void save() {
        String name = editName.getText().toString();
        String date = editDate.getText().toString();
        int id = groupGender.getCheckedRadioButtonId();
        String g = "";
        if (id == R.id.rbMale) g = "male";
        else if (id == R.id.rbFemale) g = "female";

        SharedPreferences.Editor e = sp.edit();
        e.putString("name", name);
        e.putString("date", date);
        e.putString("gender", g);
        e.apply();
        Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
    }

    void load() {
        String name = sp.getString("name", "");
        String date = sp.getString("date", "");
        String g = sp.getString("gender", "");
        editName.setText(name);
        editDate.setText(date);
        if (g.equals("male")) rbMale.setChecked(true);
        else if (g.equals("female")) rbFemale.setChecked(true);
    }

    void showDate() {
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        int m = c.get(Calendar.MONTH);
        int d = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dp = new DatePickerDialog(this, (view, y1, m1, d1) -> {
            String s = y1 + "-" + (m1 + 1) + "-" + d1;
            editDate.setText(s);
        }, y, m, d);
        dp.getDatePicker().setMaxDate(System.currentTimeMillis());
        dp.show();
    }
}