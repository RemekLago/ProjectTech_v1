package v1.projectTech;


import static v1.projectTech.DBTest3.tmpInfo;
import static v1.projectTech.R.id.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewAnimator;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("WrongThread")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectDiskReads()
                    .detectDiskWrites()
                    .detectNetwork()   // or .detectAll() for all detectable problems
                    .penaltyLog()
                    .build());
        }
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

//        DBTest dbtest = new DBTest();
//        ArrayList<ArrayList> temp = dbtest.doInBackground();
//
//        Log.i("laczenie", "url adress: " + URL);
//
//        TextView textView1 = findViewById(R.id.textView1);
//        TextView textView2 = findViewById(R.id.textView2);
//
//        textView1.setText((CharSequence) temp.get(0).get(0));
//        textView2.setText((CharSequence) temp.get(1).get(0));
//
//        DBTest2 dbtest2 = new DBTest2();
//        ArrayList<ArrayList> temp2 = dbtest2.doInBackground();
//
//        Log.i("laczenie", "url adress: " + URL);
//
//        TextView textView3 = findViewById(R.id.textView3);
//        TextView textView4 = findViewById(R.id.textView4);
//
//        textView3.setText((CharSequence) temp2.get(0).get(0));
//        textView4.setText((CharSequence) temp2.get(1).get(0));

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity2();
            }
        });


        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity3();
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity4();
            }
        });
    }
    private void openMainActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    private void openMainActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    private void openMainActivity4() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}