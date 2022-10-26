package v1.projectTech;
import static v1.projectTech.InformacjaOLokalizacji.numberOfColumns;
import static v1.projectTech.InformacjeOPozycji.rStatus;

import android.os.AsyncTask;
import android.util.Log;
import android.view.Gravity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class DBTest3 extends AsyncTask<String, Void, ArrayList<ArrayList>> {

    ArrayList<ArrayList> finalResult = new ArrayList<>();
    ArrayList<String> ListWithColumnsNames = new ArrayList<>();
    ArrayList<Integer> ListWithColumnsWidth = new ArrayList<>();
    ArrayList<Integer> ListWithColumnsAdjust= new ArrayList<>();


    public static HashMap<String, String> tmpInfo;
//    public static ArrayList<ArrayList> tmpLokalizacja;


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
            Log.i("laczenie", "Column1: " + tmpOneColumn);
            ListWithColumnsNames.add(tmpOneColumn);
        }
        return ListWithColumnsNames;
    }

//    public ArrayList<Integer> columnsWidth(ArrayList<ArrayList> reckords) {
//        for (int i = 0; i < numberOfColumns; i++) {
//            String tmpOneColumn = (reckords.get(0).get(i).toString()).split("\\|")[2];
//            Log.i("laczenie", "parameterColumn2: " + tmpOneColumn);
//            ListWithColumnsWidth.add(tmpOneColumn);
//        }
//            return ListWithColumnsWidth;
//    }

    public ArrayList<Integer> columnsAdjust(ArrayList<ArrayList> reckords) {
        int tmpOneColumnInt;
        for (int i = 0; i < numberOfColumns; i++) {
            String tmpOneColumn = (reckords.get(0).get(i).toString()).split("\\|")[2];
            Log.i("laczenie", "parameterColumn3: " + tmpOneColumn);

            switch (tmpOneColumn){
                case "1":
                    tmpOneColumnInt = 17; //CENTER
                    break;
                case "0":
                    tmpOneColumnInt = 3; //LEFT
                    break;
                case "2":
                    tmpOneColumnInt = 5; //RIGHT
                    break;
                default:
                    tmpOneColumnInt = 0; //NO GRAVITY - NO ALIGNMENT
            }
            ListWithColumnsAdjust.add(tmpOneColumnInt);
        }
        return ListWithColumnsAdjust;
    }

}