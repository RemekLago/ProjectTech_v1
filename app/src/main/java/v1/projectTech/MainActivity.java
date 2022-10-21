package v1.projectTech;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    // Connection to database
    String user = "MobiTech",
            pass = "M0b1T3ch",
            db = "MobiTech",
            ip = "192.168.1.41",
            port = "51558";
    String URL = "jdbc:jtds:sqlserver://"+ip+":"+port+"/"+db;

//    String QR_Code = "WYGPZ2201681|         1897 013 05|0,300|0|S300-2205||562105_1|749955|NEW|||124/A/05/22||||20.05.22|||||||";

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

        DBTest2 dbtest2 = new DBTest2();
        ArrayList<ArrayList> temp2 = dbtest2.doInBackground();

        Log.i("laczenie", "url adress: " + URL);

        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);

        textView3.setText((CharSequence) temp2.get(0).get(0));
        textView4.setText((CharSequence) temp2.get(1).get(0));


    }

}