package v1.projectTech;

import android.os.AsyncTask;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

public class DBTest3<Public> extends AsyncTask<String, Void, ArrayList<ArrayList>> {

    ArrayList<ArrayList> finalResult = new ArrayList<>();
    public static String rStatus, rKomunikat, rPozycja, rPozycjaNazwa;
    public static HashMap<String, String> tmpInfo;


    @Override
    protected ArrayList<ArrayList> doInBackground(String... strings) {

        InformacjeOPozycji informacjeOPozycji = new InformacjeOPozycji();
        tmpInfo = informacjeOPozycji.pobieranieInformacjiOPozycji();



//        try {
//            String user = Pass.user2;
//            String pass = Pass.pass2;
//            String db = Pass.db2;
//            String ip = Pass.ip2;
//            String port = Pass.port2;
//            String URL = "jdbc:jtds:sqlserver://"+ip+":"+port+"/"+db;
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//
//            Connection connection = DriverManager.getConnection(URL, user, pass);
//            Log.i("laczenie", "Connected to: " + connection.toString());
//
//
//            CallableStatement callableStatement = connection.prepareCall(
//                    "{call MT_Public_Pozycja_Informacje(?,?,?,?,?,?,?)}");
//            Log.i("laczenie", "CallableStatement: " + callableStatement.toString());
//
//            String Firma = "750";
//            String UserID = "0";
//            String Barcode = "WYGPZ2201681|         1897 013 05|0,300|0|S300-2205||562105_1|749955|NEW|||124/A/05/22||||20.05.22|||||||";
//
//            callableStatement.setInt("Firma", Integer.valueOf(Firma));
//            callableStatement.setInt("UserId", Integer.valueOf(UserID));
//            callableStatement.setString("Barcode", Barcode);
//
//            callableStatement.registerOutParameter("rStatus", java.sql.Types.INTEGER);
//            callableStatement.registerOutParameter("rKomunikat", Types.VARCHAR);
//            callableStatement.registerOutParameter("rPozycja", java.sql.Types.VARCHAR);
//            callableStatement.registerOutParameter("rPozycjaNazwa", java.sql.Types.VARCHAR);
//
//            callableStatement.execute();
//
//            rStatus = callableStatement.getString("rStatus");
//            rKomunikat = callableStatement.getString("rKomunikat");
//            rPozycja = callableStatement.getString("rPozycja");
//            rPozycjaNazwa = callableStatement.getString("rPozycjaNazwa");
//
//            Log.i("laczenie", "rStatus: " + rStatus);
//            Log.i("laczenie", "rKomunikat: " + rKomunikat);
//            Log.i("laczenie", "rPozycja: " + rPozycja);
//            Log.i("laczenie", "rPozycjaNazwa: " + rPozycjaNazwa);
//
//
//            callableStatement.close();
//            connection.close();
//        } catch(Exception e){
////            e.printStackTrace();
//            Log.i("laczenie", "exception " + e.toString());
//        }
        return finalResult;
    }



}