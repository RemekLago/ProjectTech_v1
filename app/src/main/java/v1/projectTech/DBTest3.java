package v1.projectTech;

import static v1.projectTech.InformacjeOPozycji.rStatus;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class DBTest3<Public> extends AsyncTask<String, Void, ArrayList<ArrayList>> {

    ArrayList<ArrayList> finalResult = new ArrayList<>();

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
}