package sg.edu.rp.c346.id22043300.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TVc346;
    TextView TVc235;
    TextView TVc206;
    TextView TVc203;
    TextView TVc218;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVc346 = findViewById(R.id.textView_C346);
        TVc218 = findViewById(R.id.textView_C218);
        TVc206 = findViewById(R.id.textView_C206);
        TVc203 = findViewById(R.id.textView_C203);
        TVc235 = findViewById(R.id.textView_C235);

        TVc346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("module_code", "C346");
                intent.putExtra("module_name", getString(R.string.c346));
                intent.putExtra("acad_year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("module_credit", 4);
                intent.putExtra("venue", "E63A");
                startActivity(intent);
            }
        });

        TVc218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("module_code", "C218");
                intent.putExtra("module_name", getString(R.string.c218));
                intent.putExtra("acad_year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("module_credit", 4);
                intent.putExtra("venue", "W64P");
                startActivity(intent);
            }
        });

        TVc206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("module_code", "C206");
                intent.putExtra("module_name", getString(R.string.c206));
                intent.putExtra("acad_year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("module_credit", 4);
                intent.putExtra("venue", "W64P");
                startActivity(intent);
            }
        });

        TVc203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("module_code", "C203");
                intent.putExtra("module_name", getString(R.string.c203));
                intent.putExtra("acad_year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("module_credit", 4);
                intent.putExtra("venue", "W64P");
                startActivity(intent);
            }
        });

        TVc235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("module_code", "C235");
                intent.putExtra("module_name", getString(R.string.c235));
                intent.putExtra("acad_year", 2023);
                intent.putExtra("sem", 1);
                intent.putExtra("module_credit", 4);
                intent.putExtra("venue", "W64P");
                startActivity(intent);
            }
        });
    }
}