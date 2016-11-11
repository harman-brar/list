package app.com.example.hbrar_000.imagelist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] web = {
            "ALTERNATIVE EDUCATION – DISPELLING THE MYTH",
            "AN INNOVATIVE PRIMARY FRENCH IMMERSION REPORT CARD",
            "ASSESSMENT AND HOW WE COMMUNICATE STUDENT LEARNING ALONGSIDE THE SHIFTING CURRICULUM",
            "ASSESSMENT, GRADING AND REPORTING FIELD TEST",
            "AUTHENTIC SCIENCE PARTNERSHIP: INQUIRE, RESEARCH, EXPERIENCE (ASPIRE)",
            "COMMUNICATING STUDENT ASSESSMENT",
            "COMMUNICATING STUDENT LEARNING",
            "COMMUNICATING STUDENT LEARNING",
            "DEVELOPING COMPETENCIES",
            "DYNAMIC SCIENCE LEARNING THROUGH STUDENT CHOICE",
            "ELEMENTARY MATH INNOVATION PROJECT",
            "FIRST NATIONS OUTDOOR EDUCATION PROGRAM",
            "FIRST PEOPLES",
            "hfsdiohf",
            "iosf\nvnjknvkjdf"

    } ;
    Integer[] imageId = {
            R.drawable.experiential_learning,
            R.drawable.reporting_and_assessment,
            R.drawable.reporting_and_assessment,
            R.drawable.reporting_and_assessment,
            R.drawable.project_based_learning,
            R.drawable.rural,
            R.drawable.multi_grade_classrooms,
            //breakpoint
            R.drawable.reporting_and_assessment,
            R.drawable.project_based_learning,
            R.drawable.cross_curricular,
            R.drawable.aboriginal_learning_cultural_development,
            R.drawable.experiential_learning,
            R.drawable.aboriginal_learning_cultural_development,
            //breakpoint
            R.drawable.aboriginal_learning_cultural_development,
            R.drawable.rural,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList adapter = new
                CustomList(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    startActivity(new Intent(MainActivity.this, test.class));
                }
            }
        });

    }

}
