package v1.projectTech.Pobieranie_danych_z_bazy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import v1.projectTech.R;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        createOneRow();


    }

    public void createLayouts() {
        int tmpnumberOfRows = MainActivity2.temp3.size();
        String[] numberOfLayouts = new String[5];
        for (int i = 0; i < 5; i++) {

            LinearLayout linearLayout3_1_in = findViewById(R.id.layout4_1);

        }
     }

    public void createOneRow() {
//        int tmpNumberOfColumns = InformacjaOLokalizacji.numberOfColumns;

        LinearLayout linearLayout3_1_in = findViewById(R.id.layout3_1);
        LinearLayout linearLayout4_1_in = findViewById(R.id.layout4_1);//find the linear layout
        linearLayout4_1_in.removeAllViews();   //add this too

            for (int i = 0; i < 5; i++) {                                                        //looping to create 5 textviews
                TextView textView = new TextView(this);                                    //dynamically create textview
                textView.setLayoutParams(new LinearLayout.LayoutParams(             //select linearlayoutparam- set the width & height
                        ViewGroup.LayoutParams.WRAP_CONTENT, 40));
                textView.setGravity(Gravity.FILL_VERTICAL);                       //set the gravity
                textView.setText("Textview: " + i);                                    //adding text
                linearLayout4_1_in.addView(textView);           //inflating :)
            }
    }

    public void createTableFromRows() {
        int tmpnumberOfRows = MainActivity2.temp3.size();

        for (int i = 0; i < 10; i++) {
            createLayouts();
            createOneRow();
        }

    }
}