package classActivity.num4;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StudentDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_detail);

        TextView nameView = findViewById(R.id.text_student_name);
        TextView idView = findViewById(R.id.text_student_id);

        String name = getIntent().getStringExtra("studentName");
        String id = getIntent().getStringExtra("studentId");

        nameView.setText("Name: " + name);
        idView.setText("ID: " + id);
    }
}