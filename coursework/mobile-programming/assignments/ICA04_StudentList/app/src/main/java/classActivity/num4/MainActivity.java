package classActivity.num4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Student[] students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        students = Student.getStudentsFromResources(this);

        ArrayAdapter<Student> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                students
        );

        ListView listStudents = findViewById(R.id.list_students);
        listStudents.setAdapter(adapter);

        listStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, StudentDetailActivity.class);
                intent.putExtra("studentName", students[position].getName());
                intent.putExtra("studentId", students[position].getId());
                startActivity(intent);
            }
        });
    }
}