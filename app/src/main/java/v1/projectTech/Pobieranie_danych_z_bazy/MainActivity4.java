package v1.projectTech.Pobieranie_danych_z_bazy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import v1.projectTech.R;

public class MainActivity4 extends AppCompatActivity implements RecyclerViewInterface{

    DBTest3 dbtest3 = new DBTest3();
    ArrayList<ArrayList> temp3 = dbtest3.doInBackground();
    int numberOfRows = temp3.size();
    int numberOfColumns = InformacjaOLokalizacji.numberOfColumns;
    ArrayList<ArrayList> FinalListWithColumnsData = temp3;
    ArrayList<String> FinalListWithColumnsNames = dbtest3.columnsNames(temp3);
    ArrayList<Integer> FinalListWithColumnsWidth = dbtest3.columnsWidth(temp3);
    ArrayList<Integer> FinalListWithColumnsAdjust = dbtest3.columnsAdjust(temp3);
    ArrayList<String> FinalListWithCellsColor = dbtest3.cellsColor(temp3);
    ArrayList<ArrayList> data1;



    ArrayList<ArrayList> addingNamesOfColumns() {

    for (int i = 0; i < FinalListWithColumnsNames.size(); i ++) {
        FinalListWithColumnsData.get(0).set(i, FinalListWithColumnsNames.get(i));
        Log.i("laczenie", "method-addingNamesOfColumns1: " + FinalListWithColumnsData.get(0).get(i));
        Log.i("laczenie", "method-addingNamesOfColumns2: " + FinalListWithColumnsData.get(0).set(i, FinalListWithColumnsNames.get(i)));
    }

    return FinalListWithColumnsData;
    }

    ArrayList<ArrayList> addingColorOfColumns(ArrayList<ArrayList> data) {
        for (int i = 1; i < data.size(); i++) {
            data.get(i).set(0, FinalListWithCellsColor.get(i-1));
            Log.i("laczenie", "method-addingColorOfColumns1: " + data.get(i).get(0));
            Log.i("laczenie", "method-addingColorOfColumns2: " + data.get(i).set(0, FinalListWithCellsColor.get(i-1)));
        }
        return FinalListWithColumnsData;
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);



//        data1 = new ArrayList<>();
//        data1 = FinalListWithColumnsDataWithMainNames;
        ArrayList<ArrayList> data0 = addingNamesOfColumns();
            data1 =         addingColorOfColumns(data0);

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

        AdapterRecyclerView adapterRecyclerView = new AdapterRecyclerView(this,data1, this);
        recyclerView1.setAdapter(adapterRecyclerView);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
//
//
//        //            textView1.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString()));
//        textView2.setBackgroundColor(Color.parseColor(data1.get().get(0).toString()));
//
//        textView3.setBackgroundColor(Color.parseColor((data1.get(0).get(0).toString())));
////                textView4.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString())));
////                textView5.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString())));
////                textView6.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString())));
////                textView7.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString())));
////                textView8.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString())));
////                textView9.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString())));
////                textView10.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString())));
////                textView11.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString())));
////                textView12.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString())));
////                textView13.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString())));
////                textView14.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString())));
////                textView14.setBackgroundColor(Color.parseColor((data1.get(position).get(0).toString())));

    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(getApplicationContext(), "Position: " + position, Toast.LENGTH_LONG).show();
    }
}