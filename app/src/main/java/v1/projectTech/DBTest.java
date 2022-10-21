package v1.projectTech;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.util.Log;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

public class DBTest extends AsyncTask<String, Void, ArrayList<ListItems>> {

    ArrayList<ListItems> itemList = new ArrayList<>();


    @Override
    protected ArrayList<ListItems> doInBackground(String... strings) {
        itemList.clear();
        try {
            String user = "MobiTech",
            pass = "M0b1T3ch",
            db = "MobiTech",
            ip = "192.168.1.41",
            port = "51558";
            String URL = "jdbc:jtds:sqlserver://"+ip+":"+port+"/"+db;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection connection = DriverManager.getConnection(URL, user, pass);
            Log.i("laczenie", "Connected to: " + connection.toString());


            Statement statement = connection.createStatement();
//////            String queryString = "select [Firma], [Pozycja] from [MobiTech.dbo.]";
//            CallableStatement callableStatement = connection.prepareCall("{call [dbo].MT_Public_Pozycja_Informacje(?,?,?,?,?,?,?)}");
            CallableStatement callableStatement = connection.prepareCall("{call [CzyLiczbaParzysta](?,?)}");
            Log.i("laczenie", "CallableStatement: " +callableStatement.toString());

            String id, rFirma = "750", userID = "0", barcode = null, Status = null, PozycjaNazwa = "SC9-HXSL(St)HXRHX-JZ 0,6/1 kV 7x1,5", Pozycja = null, Komunikat = null, A1 = null, A2 = null;

//            callableStatement.registerOutParameter(1, Types.VARCHAR);
//            callableStatement.registerOutParameter(2, Types.VARCHAR);
//            callableStatement.registerOutParameter(2, Types.VARCHAR);
//            callableStatement.registerOutParameter(3, java.sql.Types.VARCHAR);
//            callableStatement.registerOutParameter(4, java.sql.Types.VARCHAR);
//            callableStatement.registerOutParameter(5, java.sql.Types.VARCHAR);
//            callableStatement.registerOutParameter(6, java.sql.Types.VARCHAR);
//            callableStatement.registerOutParameter(7, java.sql.Types.VARCHAR);



//            Log.i("laczenie", rFirma.toString());
//            callableStatement.setInt(1, 0);     // Pierwszy parametr zastępujący ResultSet
            callableStatement.setString("Firma", rFirma);
            callableStatement.setString("UserId", userID);
//            callableStatement.setString("Barcode", barcode);
//            callableStatement.setString("rStatus", Status);
//            callableStatement.setString("rKomunikat", Komunikat);
//            callableStatement.setString("rPozycja", Pozycja);
//            callableStatement.setString("rPozycjaNazwa", PozycjaNazwa);
//            callableStatement.setString("rA1", A1);



            ResultSet rs = callableStatement.executeQuery();
//            ResultSet rs = statement.executeQuery(queryString);

//            Log.i("laczenie", "rs: " + callableStatement.getString(1));
//            Log.i("laczenie", "rs: " + callableStatement.getString(2));
//            Log.i("laczenie", "rs: " + callableStatement.getString(3));
//            Log.i("laczenie", "rs: " + callableStatement.getString(4));
//            Log.i("laczenie", "rs: " + callableStatement.getString(5));

            while (rs.next()) {
                String pozycja = rs.getString("Pozycja").trim();
                String nazwa = rs.getString("PozycjaNazwa").trim();
//                itemList.add(pozycja);
                Log.i("laczenie", "pozycja: " + pozycja);
                Log.i("laczenie", "pozycja: " + nazwa);
//                Log.i("laczenie", pozycja.getItem2());
            }
            callableStatement.close();
            connection.close();
        }
        catch (Exception e){
//            e.printStackTrace();
            Log.i("laczenie", "exception " + e.toString());
        }
        return itemList;
    }



}