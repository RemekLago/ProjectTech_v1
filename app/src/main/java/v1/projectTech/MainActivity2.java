package v1.projectTech;

import static v1.projectTech.DBTest3.tmpInfo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    // Connection to database
    String user = Pass.user,
            pass = Pass.pass,
            db = Pass.db,
            ip = Pass.ip,
            port = Pass.port;
    String URL = Pass.URL;

    @SuppressLint("WrongThread")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        DBTest3 dbtest3 = new DBTest3();
        ArrayList<ArrayList> temp3 = dbtest3.doInBackground();

        TextView textView1_1 = findViewById(R.id.textView1_1);
        TextView textView1_2 = findViewById(R.id.textView1_2);
        TextView textView1_3 = findViewById(R.id.textView1_3);
        TextView textView1_4 = findViewById(R.id.textView1_4);
        TextView textView1_5 = findViewById(R.id.textView1_5);
        TextView textView1_6 = findViewById(R.id.textView1_6);


        textView1_1.setText((CharSequence) temp3.get(0).get(0));
        textView1_2.setText((CharSequence) temp3.get(0).get(1));
        textView1_3.setText((CharSequence) temp3.get(0).get(2));
        textView1_4.setText((CharSequence) temp3.get(0).get(3));
        textView1_5.setText((CharSequence) temp3.get(0).get(4));
        textView1_6.setText((CharSequence) temp3.get(0).get(5));

    }
}