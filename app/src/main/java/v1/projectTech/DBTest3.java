package v1.projectTech;
import static v1.projectTech.InformacjaOLokalizacji.numberOfColumns;
import static v1.projectTech.InformacjeOPozycji.rStatus;

import android.os.AsyncTask;
import android.util.Log;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.IntegerRes;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class DBTest3 extends AsyncTask<String, Void, ArrayList<ArrayList>> {

    ArrayList<ArrayList> finalResult = new ArrayList<>();
    ArrayList<String> ListWithColumnsNames = new ArrayList<>();
    ArrayList<Integer> ListWithColumnsWidth = new ArrayList<>();
    ArrayList<Integer> ListWithColumnsAdjust = new ArrayList<>();
    ArrayList<String > ListWithCellColor = new ArrayList<>();


    public static HashMap<String, String> tmpInfo;

    @Override
    protected ArrayList<ArrayList> doInBackground(String... strings) {

        InformacjeOPozycji informacjeOPozycji = new InformacjeOPozycji();
        tmpInfo = informacjeOPozycji.pobieranieInformacjiOPozycji();


        if (Objects.equals(rStatus, "1")) {
            InformacjaOLokalizacji informacjaOLokalizacji = new InformacjaOLokalizacji();
            finalResult = informacjaOLokalizacji.pobieranieInformacjiOLokalizacji();
        }
        return finalResult;
    }

    public ArrayList<String> columnsNames(ArrayList<ArrayList> reckords) {
        for (int i = 0; i < numberOfColumns; i++) {
            String tmpOneColumn = (reckords.get(0).get(i).toString()).split("\\|")[1];
//            Log.i("laczenie", "Column1: " + tmpOneColumn);
            ListWithColumnsNames.add(tmpOneColumn);
        }
        return ListWithColumnsNames;
    }

    public ArrayList<Integer> columnsWidth(ArrayList<ArrayList> reckords) {
        for (int i = 0; i < numberOfColumns; i++) {
            String tmpOneColumn = (reckords.get(0).get(i).toString()).split("\\|")[2];
            int tmpOneColumnInt = Integer.parseInt(tmpOneColumn);

            ListWithColumnsWidth.add(2 * tmpOneColumnInt);

            Log.i("laczenie", "dlugoŚć1: " + tmpOneColumn);
            Log.i("laczenie", "dlugoŚć3: " + tmpOneColumnInt);
        }
//            Log.i("laczenie", "parameterColumn2: " + tmpOneColumn);
        return ListWithColumnsWidth;
    }

    public ArrayList<Integer> columnsAdjust(ArrayList<ArrayList> reckords) {
        int tmpOneColumnInt;
        for (int i = 0; i < numberOfColumns; i++) {
            String tmpOneColumn = (reckords.get(0).get(i).toString()).split("\\|")[2];
//            Log.i("laczenie", "parameterColumn3: " + tmpOneColumn);

            switch (tmpOneColumn) {
                case "2":
                    tmpOneColumnInt = 17; //CENTER
                    break;
                case "0":
                    tmpOneColumnInt = 3; //LEFT
                    break;
                case "1":
                    tmpOneColumnInt = 5; //RIGHT
                    break;
                default:
                    tmpOneColumnInt = 0; //NO GRAVITY - NO ALIGNMENT
            }
            ListWithColumnsAdjust.add(tmpOneColumnInt);
        }
        return ListWithColumnsAdjust;
    }

//    public ArrayList<String> columnsData(ArrayList<ArrayList> reckords) {
//        int numberOfRows = finalResult.size() - 1;
//        for (int i = 1; i < numberOfRows; i++) {
//            for (int j = 0; j < numberOfColumns; j++) {
//
//            }
//            String tmpOneColumn = (reckords.get(i).get(i).toString());
//            Log.i("laczenie", "Data1: " + tmpOneColumn);
//            ListWithColumnsData.add(tmpOneColumn);
//        }
//        return ListWithColumnsData;
//    }

    public ArrayList<String > cellsColor(ArrayList<ArrayList> reckords) {
        int numberOfRows = reckords.size() - 1;

        for (int i = 1; i <= numberOfRows; i++) {
            String[] tmpOneRowTable = reckords.get(i).get(0).toString().split(",");
            String tmpOneRow = tmpOneRowTable[0]+","+tmpOneRowTable[1]+","+tmpOneRowTable[2];
            Log.i("laczenie", "Data1: " + tmpOneRow);
            switch (tmpOneRow) {
                case "255,255,255":
                    tmpOneRow = "#FF0000"; //color RED
                    break;
                case "255,000,000":
                    tmpOneRow = "#E6E6E6"; //color GREY
                    break;
                case "000,000,000":
                    tmpOneRow = "#FFFFFFFF"; //color WHITE
                    break;
                default:
                    tmpOneRow = "#FFFFFFFF"; //color WHITE
            }

                    Log.i("laczenie", "Data2: " + tmpOneRow);
                    ListWithCellColor.add(tmpOneRow);
            }
            return ListWithCellColor;
        }
}