package v1.projectTech.Czytanie_Etykiety;

import static v1.projectTech.Czytanie_Etykiety.MainActivity_Etykieta.Result1;

import android.util.Log;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

public class Procedura_Magazyn_Pozycje_Lokalizacje {

    static ArrayList<ArrayList<String>> Result2 = new ArrayList<>();
    public static String Firma, UserID, Pozycja;
    static int numberOfColumns;


    public static ArrayList<ArrayList<String>> takingLocalizationPosition() {

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
                    "{call MT_Magazyn_lsv_pozycja_magazyny_lokalizacje(?,?,?)}");
            Log.i("checking", "CallableStatement: " + callableStatement.toString());

            Firma = "750";
            UserID = "0";
            Pozycja = Result1.get("Pozycja");

            callableStatement.setInt("Firma", Integer.valueOf(Firma));
            callableStatement.setInt("UserId", Integer.valueOf(UserID));
            callableStatement.setString("Pozycja", Pozycja);

            ResultSet rs = callableStatement.executeQuery();

            //taking metadata and checking how many columns is in downloaded data
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            ArrayList<String> columnsNames = new ArrayList<>();

            for (int i = 1; i <= columnCount; i++) {
                String columnName = rsmd.getColumnName(i);
                columnsNames.add(columnName);
            }
            numberOfColumns = columnsNames.size();

            while (rs.next()) {
                ArrayList<String> tmpReckord = new ArrayList();
                for (int i = 0; i <= numberOfColumns; i++) {
                    tmpReckord.add(rs.getString(i));
                    Log.i("checking", "reckord from Result2: " + rs.getString(i));
                }

                Result2.add(tmpReckord);
            }
            callableStatement.close();
            connection.close();

        } catch (Exception e) {
            Log.i("checking", "exception takingLocalizationPosition()" + e.toString());
        }
        return Result2;
    }
}
