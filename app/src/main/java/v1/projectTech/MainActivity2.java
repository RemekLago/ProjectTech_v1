package v1.projectTech;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    public static ArrayList<ArrayList> temp3;
    public static ArrayList<String> FinalListWithColumnsNames;

    @SuppressLint({"WrongThread", "RtlHardcoded"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        DBTest3 dbtest3 = new DBTest3();
        ArrayList<ArrayList> temp3 = dbtest3.doInBackground();
        ArrayList<String> FinalListWithColumnsNames = dbtest3.columnsNames(temp3);
//        ArrayList<Integer> FinalListWithColumnsWidth = dbtest3.columnsWidth(temp3);
        ArrayList<Integer> FinalListWithColumnsAdjust = dbtest3.columnsAdjust(temp3);

        TextView textView1_1 = findViewById(R.id.textView1_1);
        TextView textView1_2 = findViewById(R.id.textView1_2);
        TextView textView1_3 = findViewById(R.id.textView1_3);
        TextView textView1_4 = findViewById(R.id.textView1_4);
        TextView textView1_5 = findViewById(R.id.textView1_5);
        TextView textView1_6 = findViewById(R.id.textView1_6);

        // ustawianie tekstu kolumny
        textView1_1.setText(FinalListWithColumnsNames.get(0));
        textView1_2.setText(FinalListWithColumnsNames.get(1));
        textView1_3.setText(FinalListWithColumnsNames.get(2));
        textView1_4.setText(FinalListWithColumnsNames.get(3));
        textView1_5.setText(FinalListWithColumnsNames.get(4));
        textView1_6.setText(FinalListWithColumnsNames.get(5));

        ViewGroup.LayoutParams params = textView1_1.getLayoutParams();
//        params.width = FinalListWithColumnsWidth.get(0);
        params.width = 250;
        textView1_1.setLayoutParams(params);

        // ustawianie justowania kolumny
        textView1_1.setGravity(FinalListWithColumnsAdjust.get(0));
        textView1_1.setGravity(FinalListWithColumnsAdjust.get(1));
        textView1_1.setGravity(FinalListWithColumnsAdjust.get(2));
        textView1_1.setGravity(FinalListWithColumnsAdjust.get(3));
        textView1_1.setGravity(FinalListWithColumnsAdjust.get(4));
        textView1_1.setGravity(FinalListWithColumnsAdjust.get(5));

    }
}