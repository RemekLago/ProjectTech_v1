package v1.projectTech.Pobieranie_danych_z_bazy;

import static v1.projectTech.Pobieranie_danych_z_bazy.DBTest3.tmpInfo;
import android.util.Log;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

public class InformacjaOLokalizacji {

    static ArrayList<ArrayList> finalResult = new ArrayList<>();
    public static String rStatus, rKomunikat, rPozycja, rPozycjaNazwa;
    public static String rLok, rWariantOpis, rPartia;
    public static int rMagazyn, rWariant;
    public static float rIloscKm, rRezerwa;
    static int numberOfColumns;

    public ArrayList<ArrayList> pobieranieInformacjiOLokalizacji() {

        try {
            String user = Pass.user2;
            String pass = Pass.pass2;
            String db = Pass.db2;
            String ip = Pass.ip2;
            String port = Pass.port2;
            String URL = "jdbc:jtds:sqlserver://" + ip + ":" + port + "/" + db;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection connection = DriverManager.getConnection(URL, user, pass);
            Log.i("laczenie", "Connected to: " + connection.toString());


            CallableStatement callableStatement = connection.prepareCall(
                    "{call MT_Magazyn_lsv_pozycja_magazyny_lokalizacje(?,?,?)}");
            Log.i("laczenie", "CallableStatement: " + callableStatement.toString());

            String Firma = "750";
            String UserID = "1";
            String Pozycja = tmpInfo.get("Pozycja");

            callableStatement.setInt("Firma", Integer.valueOf(Firma));
            callableStatement.setInt("UserId", Integer.valueOf(UserID));
            callableStatement.setString("Pozycja", Pozycja);

            ResultSet rs = callableStatement.executeQuery();

            //pobieranie metadanych o tabeli, szukanie ile jest kolumn w tabeli
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            ArrayList<String> columnsNames = new ArrayList<>();

            for (int i = 1; i <= columnCount; i++) {
                String columnName = rsmd.getColumnName(i);
                columnsNames.add(columnName);
            }
            numberOfColumns = columnsNames.size();
            finalResult.add(columnsNames);

            while (rs.next()) {
                ArrayList<Object> tmpReckord = new ArrayList();
                for (int i = 1; i <= numberOfColumns; i++) {
                    tmpReckord.add(rs.getString(i));
                    Log.i("laczenie", "rekord z wiersza: " + rs.getString(i));
                }

                finalResult.add(tmpReckord);
            }

//            Log.i("laczenie", "kolumny z tabeli: " + finalResult.get(0).toString());
//            Log.i("laczenie", "rekord z tabeli: " + finalResult.get(10).toString());
//            Log.i("laczenie", "rekord z tabeli: " + finalResult.get(20).toString());
//            Log.i("laczenie", "rekord z tabeli: " + finalResult.get(30).toString());

            callableStatement.close();
            connection.close();
        } catch (Exception e) {
            Log.i("laczenie", "exception " + e.toString());
        }
//        Log.i("laczenie", "ColumnFinalResult: " + (finalResult.get(0).get(0).toString()).split("\\|")[1]);
        return finalResult;
    }

}