package v1.projectTech.Czytanie_Etykiety;

import android.util.Log;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.HashMap;

public class Procedura_Pozycja_Informacje {

    public static String rStatus, rKomunikat, rPozycja, rPozycjaNazwa;
    public static String Firma, UserID, Barcode;
    static HashMap<String, String> tmpHashMap = new HashMap<String, String>();

    public static HashMap<String, String> takingPositionInformation() {

        //connecting to database
        try {
            String user = v1.projectTech.Czytanie_Etykiety.Pass.user;
            String pass = v1.projectTech.Czytanie_Etykiety.Pass.pass;
            String db = v1.projectTech.Czytanie_Etykiety.Pass.db;
            String ip = v1.projectTech.Czytanie_Etykiety.Pass.ip;
            String port = v1.projectTech.Czytanie_Etykiety.Pass.port;
            String URL = "jdbc:jtds:sqlserver://" + ip + ":" + port + "/" + db;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection connection = DriverManager.getConnection(URL, user, pass);
            Log.i("checking", "Connected to: " + connection.toString());

            CallableStatement callableStatement = connection.prepareCall(
                    "{call MT_Public_Pozycja_Informacje(?,?,?,?,?,?,?)}");
            Log.i("checking", "CallableStatement: " + callableStatement.toString());

            Firma = "750";
            UserID = "0";
            Barcode = "WYGPZ2201681|         1897 013 05|0,300|0|S300-2205||562105_1|749955|NEW|||124/A/05/22||||20.05.22|||||||";

            callableStatement.setInt("Firma", Integer.valueOf(Firma));
            callableStatement.setInt("UserId", Integer.valueOf(UserID));
            callableStatement.setString("Barcode", Barcode);

            callableStatement.registerOutParameter("rStatus", java.sql.Types.INTEGER);
            callableStatement.registerOutParameter("rKomunikat", Types.VARCHAR);
            callableStatement.registerOutParameter("rPozycja", java.sql.Types.VARCHAR);
            callableStatement.registerOutParameter("rPozycjaNazwa", java.sql.Types.VARCHAR);

            callableStatement.execute();

            rStatus = callableStatement.getString("rStatus").trim();
            rKomunikat = callableStatement.getString("rKomunikat").trim();
            rPozycja = callableStatement.getString("rPozycja").trim();
            rPozycjaNazwa = callableStatement.getString("rPozycjaNazwa").trim();

            tmpHashMap.put("Status", rStatus);
            tmpHashMap.put("Komunikat", rKomunikat);
            tmpHashMap.put("Pozycja", rPozycja);
            tmpHashMap.put("PozycjaNazwa", rPozycjaNazwa);

            Log.i("checking", "rStatus: " + rStatus);
            Log.i("checking", "rKomunikat: " + rKomunikat);
            Log.i("checking", "rPozycja: " + rPozycja);
            Log.i("checking", "rPozycjaNazwa: " + rPozycjaNazwa);

            callableStatement.close();
            connection.close();


        } catch (Exception e) {
//            e.printStackTrace();
            Log.i("checking", "exception takingPositionInformation()" + e.toString());
        }
        return tmpHashMap;
    }
}
