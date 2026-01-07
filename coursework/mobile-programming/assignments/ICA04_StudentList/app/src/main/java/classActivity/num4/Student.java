package classActivity.num4;

import android.content.Context;

public class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public String getId() { return id; }

    @Override
    public String toString() { return id; }

    public static Student[] getStudentsFromResources(Context context) {
        return new Student[]{
                new Student(
                        context.getString(R.string.student1_name),
                        context.getString(R.string.student1_id)
                ),
                new Student(
                        context.getString(R.string.student2_name),
                        context.getString(R.string.student2_id)
                ),
                new Student(
                        context.getString(R.string.student3_name),
                        context.getString(R.string.student3_id)
                )
        };
    }
}