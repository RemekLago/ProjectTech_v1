package v1.projectTech.Pobieranie_danych_z_bazy;
import static v1.projectTech.Pobieranie_danych_z_bazy.InformacjaOLokalizacji.numberOfColumns;
import static v1.projectTech.Pobieranie_danych_z_bazy.InformacjeOPozycji.rStatus;

import android.os.AsyncTask;
import android.util.Log;

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

        try {
            for (int i = 0; i < numberOfColumns; i++) {
                String tmpOneColumn = (reckords.get(0).get(i).toString()).split("\\|")[1];

//            Log.i("laczenie", "Column1: " + tmpOneColumn);
                    ListWithColumnsNames.add(tmpOneColumn);
                }
        } catch(Exception e){
            Log.i("laczenie", "exception " + e.toString());
        }
        return ListWithColumnsNames;
    }

    public ArrayList<Integer> columnsWidth(ArrayList<ArrayList> reckords) {
        try {

            for (int i = 0; i < numberOfColumns; i++) {
                String tmpOneColumn = (reckords.get(0).get(i).toString()).split("\\|")[2];
                Log.i("laczenie", "method-columnsWidth1: " + tmpOneColumn);
                              int tmpOneColumnInt = Integer.parseInt(tmpOneColumn);
                Log.i("laczenie", "method-columnsWidth1: " + tmpOneColumnInt);

                    ListWithColumnsWidth.add(3 * tmpOneColumnInt);
                }
//            Log.i("laczenie", "parameterColumn2: " + tmpOneColumn);

        } catch (Exception e) {
            Log.i("laczenie", "exception " + e.toString());
        }
        return ListWithColumnsWidth;
    }

    public ArrayList<Integer> columnsAdjust(ArrayList<ArrayList> reckords) {
        int tmpOneColumnInt;

        try {
            for (int i = 0; i < numberOfColumns; i++) {
                String tmpOneColumn = (reckords.get(0).get(i).toString()).split("\\|")[3];
            Log.i("laczenie", "method-columnsAdjust1: " + tmpOneColumn);

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
                Log.i("laczenie", "method-columnsAdjust2: " + tmpOneColumnInt);
                ListWithColumnsAdjust.add(tmpOneColumnInt);
            }
        }
        catch(Exception e) {
            Log.i("laczenie", "exception " + e.toString());
        }
        return ListWithColumnsAdjust;
    }

    public ArrayList<String > cellsColor(ArrayList<ArrayList> reckords) {
        try {
            int numberOfRows = reckords.size() - 1;
            for (int i = 1; i <= numberOfRows; i++) {
                String[] tmpOneRowTable = reckords.get(i).get(0).toString().split(",");
                String tmpOneRow = tmpOneRowTable[0] + "," + tmpOneRowTable[1] + "," + tmpOneRowTable[2];
                Log.i("laczenie", "method-cellsColor1: " + tmpOneRow);
                switch (tmpOneRow) {
                    case "255,255,255":
                        tmpOneRow = "#FFC9BB"; //color RED
                        break;
                    case "255,000,000":
                        tmpOneRow = "#F5F5F5"; //color GREY
                        break;
                    case "000,000,000":
                        tmpOneRow = "#FFFFFFFF"; //color WHITE
                        break;
                    default:
                        tmpOneRow = "#FFFFFFFF"; //color WHITE
                }

                Log.i("laczenie", "method-cellsColor2: " + tmpOneRow);
                ListWithCellColor.add(tmpOneRow);
            }
        } catch(Exception e){
            Log.i("laczenie", "exception " + e.toString());
        }
            return ListWithCellColor;
        }
}