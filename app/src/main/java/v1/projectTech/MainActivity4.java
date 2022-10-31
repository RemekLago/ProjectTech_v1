package v1.projectTech;

import static v1.projectTech.MainActivity2.temp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    DBTest3 dbtest3 = new DBTest3();
    ArrayList<ArrayList> temp3 = dbtest3.doInBackground();
    int numberOfRows = temp3.size();
    int numberOfColumns = InformacjaOLokalizacji.numberOfColumns;
    ArrayList<ArrayList> FinalListWithColumnsData = temp3;
    ArrayList<ArrayList> data1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

//        data1 = new ArrayList<>();
        data1 = FinalListWithColumnsData;

//        ArrayList<String> row1 = new ArrayList<>();
//        row1.add(0, "Ewa1");
//        row1.add(1, "Ewa2");
//        row1.add(2, "Ewa3");
//        row1.add(3, "Ewa4");
//        row1.add(4, "Ewa5");
//
//        ArrayList<String> row2 = new ArrayList<>();
//        row2.add(0, "Adam1");
//        row2.add(1, "Adam2");
//        row2.add(2, "Adam3");
//        row2.add(3, "Adam4");
//        row2.add(4, "Adam5");
//
//        ArrayList<String> row3 = new ArrayList<>();
//        row3.add(0, "Iza1");
//        row3.add(1, "Iza2");
//        row3.add(2, "Iza3");
//        row3.add(3, "Iza4");
//        row3.add(4, "Iza5");
//
//        ArrayList<String> row4 = new ArrayList<>();
//        row4.add(0, "Jan1");
//        row4.add(1, "Jan2");
//        row4.add(2, "Jan3");
//        row4.add(3, "Jan4");
//        row4.add(4, "Jan5");
//
//        data1.add(0, row1);
//        data1.add(1, row2);
//        data1.add(2, row3);
//        data1.add(3, row4);

        RecyclerView recyclerView1 = findViewById(R.id.recyclerView1);

        AdapterRecyclerView adapterRecyclerView = new AdapterRecyclerView(this,data1);
        recyclerView1.setAdapter(adapterRecyclerView);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));

    }


//    public void createOneRow() {
////        int tmpNumberOfColumns = InformacjaOLokalizacji.numberOfColumns;
//
//        LinearLayout linearLayoutRowIn = findViewById(R.id.linear);//find the linear layout
////        linearLayoutRowIn.removeAllViews();   //add this too
//
//        for (int i = 0; i < 5; i++) {                                                        //looping to create 5 textviews
//
//            TextView textView = new TextView(this);                                   //dynamically create textview
//            textView.set
//            textView.setLayoutParams(new LinearLayout.LayoutParams(             //select linearlayoutparam- set the width & height
//                    ViewGroup.LayoutParams.WRAP_CONTENT, 40));
//            textView.setGravity(Gravity.FILL_VERTICAL);                       //set the gravity
//            textView.setText("Textview: " + i);                                    //adding text
//            linearLayoutRowIn.addView(textView);           //inflating :)
//        }
//    }

}