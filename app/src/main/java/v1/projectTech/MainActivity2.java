package v1.projectTech;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    public static ArrayList<ArrayList> temp3;
    public static ArrayList<String> FinalListWithColumnsNames;
    public static DBTest3 dbtest3 = new DBTest3();

    @SuppressLint({"WrongThread", "RtlHardcoded"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        ArrayList<ArrayList> temp3 = dbtest3.doInBackground();
        ArrayList<String> FinalListWithColumnsNames = dbtest3.columnsNames(temp3);
        ArrayList<Integer> FinalListWithColumnsWidth = dbtest3.columnsWidth(temp3);
        ArrayList<Integer> FinalListWithColumnsAdjust = dbtest3.columnsAdjust(temp3);
        ArrayList<ArrayList> FinalListWithColumnsData = temp3;
        ArrayList<String> FinalListWithCellsColor = dbtest3.cellsColor(temp3);

        TextView textView1_1 = findViewById(R.id.textView1_1);
        TextView textView1_2 = findViewById(R.id.textView1_2);
        TextView textView1_3 = findViewById(R.id.textView1_3);
        TextView textView1_4 = findViewById(R.id.textView1_4);
        TextView textView1_5 = findViewById(R.id.textView1_5);
        TextView textView1_6 = findViewById(R.id.textView1_6);
        TextView textView1_7 = findViewById(R.id.textView1_7);
        TextView textView1_8 = findViewById(R.id.textView1_8);
        TextView textView1_9 = findViewById(R.id.textView1_9);
        TextView textView1_10 = findViewById(R.id.textView1_10);
        TextView textView1_11 = findViewById(R.id.textView1_11);
        TextView textView1_12 = findViewById(R.id.textView1_12);
        TextView textView1_13 = findViewById(R.id.textView1_13);
        TextView textView1_14 = findViewById(R.id.textView1_14);
        TextView textView1_15 = findViewById(R.id.textView1_15);

        TextView textView2_1 = findViewById(R.id.textView2_1);
        TextView textView2_2 = findViewById(R.id.textView2_2);
        TextView textView2_3 = findViewById(R.id.textView2_3);
        TextView textView2_4 = findViewById(R.id.textView2_4);
        TextView textView2_5 = findViewById(R.id.textView2_5);
        TextView textView2_6 = findViewById(R.id.textView2_6);
        TextView textView2_7 = findViewById(R.id.textView2_7);

        TextView textView3_1 = findViewById(R.id.textView3_1);
        TextView textView3_2 = findViewById(R.id.textView3_2);
        TextView textView3_3 = findViewById(R.id.textView3_3);
        TextView textView3_4 = findViewById(R.id.textView3_4);
        TextView textView3_5 = findViewById(R.id.textView3_5);
        TextView textView3_6 = findViewById(R.id.textView3_6);
        TextView textView3_7 = findViewById(R.id.textView3_7);

//        textView1_1.setText("TextView1");
//        textView1_2.setText("TextView1");
//        textView1_3.setText("TextView1");
//        textView1_4.setText("TextView1");
//        textView1_5.setText("TextView1");
//        textView1_6.setText("TextView1");
//        textView1_7.setText("TextView1");
//        textView1_8.setText("TextView1");
//        textView1_9.setText("TextView1");
//        textView1_10.setText("TextView1");
//        textView1_11.setText("TextView1");
//        textView1_12.setText("TextView1");
//        textView1_13.setText("TextView1");
//        textView1_14.setText("TextView1");
//        textView1_15.setText("TextView1");

        // ustawianie tekstu kolumny
        textView1_1.setText(FinalListWithColumnsNames.get(0));
        textView1_2.setText(FinalListWithColumnsNames.get(1));
        textView1_3.setText(FinalListWithColumnsNames.get(2));
        textView1_4.setText(FinalListWithColumnsNames.get(3));
        textView1_5.setText(FinalListWithColumnsNames.get(4));
        textView1_6.setText(FinalListWithColumnsNames.get(5));
        textView1_7.setText(FinalListWithColumnsNames.get(6));
        textView1_8.setText(FinalListWithColumnsNames.get(7));
        textView1_9.setText(FinalListWithColumnsNames.get(8));
        textView1_10.setText(FinalListWithColumnsNames.get(9));
        textView1_11.setText(FinalListWithColumnsNames.get(10));
        textView1_12.setText(FinalListWithColumnsNames.get(11));
        textView1_13.setText(FinalListWithColumnsNames.get(12));
        textView1_14.setText(FinalListWithColumnsNames.get(13));
        textView1_15.setText(FinalListWithColumnsNames.get(14));

        textView2_1.setText(FinalListWithColumnsData.get(1).get(0).toString());
        textView2_2.setText(FinalListWithColumnsData.get(1).get(1).toString());
        textView2_3.setText(FinalListWithColumnsData.get(1).get(2).toString());
        textView2_4.setText(FinalListWithColumnsData.get(1).get(3).toString());
        textView2_5.setText(FinalListWithColumnsData.get(1).get(4).toString());
        textView2_6.setText(FinalListWithColumnsData.get(1).get(5).toString());
        textView2_7.setText(FinalListWithColumnsData.get(1).get(6).toString());

        textView3_1.setText(FinalListWithColumnsData.get(2).get(0).toString());
        textView3_2.setText(FinalListWithColumnsData.get(2).get(1).toString());
        textView3_3.setText(FinalListWithColumnsData.get(2).get(2).toString());
        textView3_4.setText(FinalListWithColumnsData.get(2).get(3).toString());
        textView3_5.setText(FinalListWithColumnsData.get(2).get(4).toString());
        textView3_6.setText(FinalListWithColumnsData.get(2).get(5).toString());
        textView3_7.setText(FinalListWithColumnsData.get(2).get(6).toString());


        // ustawianie szerokości kolumny
        ViewGroup.LayoutParams params1 = textView1_1.getLayoutParams();
        ViewGroup.LayoutParams params2 = textView1_2.getLayoutParams();
        ViewGroup.LayoutParams params3 = textView1_3.getLayoutParams();
        ViewGroup.LayoutParams params4 = textView1_4.getLayoutParams();
        ViewGroup.LayoutParams params5 = textView1_5.getLayoutParams();
        ViewGroup.LayoutParams params6 = textView1_6.getLayoutParams();
        ViewGroup.LayoutParams params7 = textView1_7.getLayoutParams();
        ViewGroup.LayoutParams params8 = textView1_8.getLayoutParams();
        ViewGroup.LayoutParams params9 = textView1_9.getLayoutParams();
        ViewGroup.LayoutParams params10 = textView1_10.getLayoutParams();
        ViewGroup.LayoutParams params11 = textView1_11.getLayoutParams();
        ViewGroup.LayoutParams params12 = textView1_12.getLayoutParams();
        ViewGroup.LayoutParams params13 = textView1_13.getLayoutParams();
        ViewGroup.LayoutParams params14 = textView1_14.getLayoutParams();
        ViewGroup.LayoutParams params15 = textView1_15.getLayoutParams();
        params1.width = FinalListWithColumnsWidth.get(0);
        params2.width = FinalListWithColumnsWidth.get(1);
        params3.width = FinalListWithColumnsWidth.get(2);
        params4.width = FinalListWithColumnsWidth.get(3);
        params5.width = FinalListWithColumnsWidth.get(4);
        params6.width = FinalListWithColumnsWidth.get(5);
        params7.width = FinalListWithColumnsWidth.get(6);
        params8.width = FinalListWithColumnsWidth.get(7);
        params9.width = FinalListWithColumnsWidth.get(8);
        params10.width = FinalListWithColumnsWidth.get(9);
        params11.width = FinalListWithColumnsWidth.get(10);
        params12.width = FinalListWithColumnsWidth.get(11);
        params13.width = FinalListWithColumnsWidth.get(12);
        params14.width = FinalListWithColumnsWidth.get(13);
        params15.width = FinalListWithColumnsWidth.get(14);
        textView1_1.setLayoutParams(params1);
        textView1_2.setLayoutParams(params2);
        textView1_3.setLayoutParams(params3);
        textView1_4.setLayoutParams(params4);
        textView1_5.setLayoutParams(params5);
        textView1_6.setLayoutParams(params6);
        textView1_7.setLayoutParams(params7);
        textView1_8.setLayoutParams(params8);
        textView1_9.setLayoutParams(params9);
        textView1_10.setLayoutParams(params10);
        textView1_11.setLayoutParams(params11);
        textView1_12.setLayoutParams(params12);
        textView1_13.setLayoutParams(params13);
        textView1_14.setLayoutParams(params14);
        textView1_15.setLayoutParams(params15);


        // ustawianie justowania kolumny
        textView1_1.setGravity(FinalListWithColumnsAdjust.get(0));
        textView1_2.setGravity(FinalListWithColumnsAdjust.get(1));
        textView1_3.setGravity(FinalListWithColumnsAdjust.get(2));
        textView1_4.setGravity(FinalListWithColumnsAdjust.get(3));
        textView1_5.setGravity(FinalListWithColumnsAdjust.get(4));
        textView1_6.setGravity(FinalListWithColumnsAdjust.get(5));
        textView1_7.setGravity(FinalListWithColumnsAdjust.get(6));
        textView1_8.setGravity(FinalListWithColumnsAdjust.get(7));
        textView1_9.setGravity(FinalListWithColumnsAdjust.get(8));
        textView1_10.setGravity(FinalListWithColumnsAdjust.get(9));
        textView1_11.setGravity(FinalListWithColumnsAdjust.get(10));
        textView1_12.setGravity(FinalListWithColumnsAdjust.get(11));
        textView1_13.setGravity(FinalListWithColumnsAdjust.get(12));
        textView1_14.setGravity(FinalListWithColumnsAdjust.get(13));
        textView1_15.setGravity(FinalListWithColumnsAdjust.get(14));

        // ustawianie koloru komórki
        textView2_1.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(0)));
        textView2_2.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(0)));
        textView2_3.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(0)));
        textView2_4.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(0)));
        textView2_5.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(0)));
        textView2_6.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(0)));
        textView2_7.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(0)));

        textView3_1.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(5)));
        textView3_2.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(5)));
        textView3_3.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(5)));
        textView3_4.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(5)));
        textView3_5.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(5)));
        textView3_6.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(5)));
        textView3_7.setBackgroundColor(Color.parseColor(FinalListWithCellsColor.get(5)));




        Log.i("laczenie", "Nazwa: " + FinalListWithColumnsNames.get(0) +
                " Szerokość: " + FinalListWithColumnsWidth.get(0) +
                " Justowanie: " + FinalListWithColumnsAdjust.get(0));

    }
}