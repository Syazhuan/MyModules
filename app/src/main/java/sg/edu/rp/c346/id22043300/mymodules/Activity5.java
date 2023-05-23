package sg.edu.rp.c346.id22043300.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity5 extends AppCompatActivity {

    //Step 1
    TextView tvModule_Code;
    TextView tvModule_Name;
    TextView tvAcad_Year;
    TextView tvSem;
    TextView tvModule_Credit;
    TextView tvVenue;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        //Step 2
        Intent intentReceived = getIntent();

        tvModule_Code = findViewById(R.id.textView1);

        String value1 = intentReceived.getStringExtra("module_code");
        tvModule_Code.setText("Module Code: " + value1);

        tvModule_Name = findViewById(R.id.textView2);
        String value2 = intentReceived.getStringExtra("module_name");
        tvModule_Name.setText("Module Name: " + value2);

        tvAcad_Year = findViewById(R.id.textView3);
        int value3 = intentReceived.getIntExtra("acad_year", 0);
        tvAcad_Year.setText("Academic Year: " + value3);

        tvSem = findViewById(R.id.textView4);
        int value4 = intentReceived.getIntExtra("sem", 0);
        tvSem.setText("Semester: " + value4);

        tvModule_Credit = findViewById(R.id.textView5);
        int value5 = intentReceived.getIntExtra("module_credit", 0);
        tvModule_Credit.setText("Module Credit: " + value5);

        tvVenue = findViewById(R.id.textView6);
        String value6 = intentReceived.getStringExtra("venue");
        tvVenue.setText("Venue: " + value6);
    }
}