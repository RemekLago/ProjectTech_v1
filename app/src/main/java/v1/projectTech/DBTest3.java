package v1.projectTech;
import static v1.projectTech.InformacjaOLokalizacji.numberOfColumns;
import static v1.projectTech.InformacjeOPozycji.rStatus;

import android.os.AsyncTask;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class DBTest3 extends AsyncTask<String, Void, ArrayList<ArrayList>> {

    ArrayList<ArrayList> finalResult = new ArrayList<>();
    ArrayList<String> ListWithColumnsNames = new ArrayList<>();
    ArrayList<String> ListWithColumnsWidth = new ArrayList<>();
    ArrayList<String> ListWithColumnsAdjust= new ArrayList<>();


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
        Log.i("laczenie", "parameterColumn2: " + ListWithColumnsNames.size());
        return ListWithColumnsNames;
    }

    public ArrayList<String> columnsWidth(ArrayList<ArrayList> reckords) {
        for (int i = 0; i < numberOfColumns; i++) {
            String tmpOneColumn = (reckords.get(0).get(i).toString()).split("\\|")[2];
            Log.i("laczenie", "parameterColumn2: " + tmpOneColumn);
            ListWithColumnsWidth.add(tmpOneColumn);
        }
        Log.i("laczenie", "Column2: " + ListWithColumnsWidth.size());
        return ListWithColumnsWidth;
    }

    public ArrayList<String> columnsAdjust(ArrayList<ArrayList> reckords) {
        for (int i = 0; i < numberOfColumns; i++) {
            String tmpOneColumn = (reckords.get(0).get(i).toString()).split("\\|")[2];
            Log.i("laczenie", "parameterColumn2: " + tmpOneColumn);
            ListWithColumnsAdjust.add(tmpOneColumn);
        }
        Log.i("laczenie", "Column2: " + ListWithColumnsAdjust.size());
        return ListWithColumnsAdjust;
    }
}