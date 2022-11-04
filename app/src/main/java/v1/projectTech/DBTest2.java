package v1.projectTech;

import android.os.AsyncTask;
import android.util.Log;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class DBTest2 extends AsyncTask<String, Void, ArrayList<ArrayList>> {

    ArrayList<ArrayList> finalResult = new ArrayList<>();

    @Override
    protected ArrayList<ArrayList> doInBackground(String... strings) {

        try {
            String user = Pass.user,
                    pass = Pass.pass,
                    db = Pass.db,
                    ip = Pass.ip,
                    port = Pass.port;
            String URL = Pass.URL;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection connection = DriverManager.getConnection(URL, user, pass);
            Log.i("laczenie", "Connected to: " + connection.toString());


            CallableStatement callableStatement = connection.prepareCall(
                    "{call [CzyLiczbaParzysta](?,?,?,?,?,?)}");
            Log.i("laczenie", "CallableStatement: " + callableStatement.toString());

            String id, rFirma = "700", userID = "0", liczba = "100";
            String rStatus, rKomunikat, rCzyParzysta;

            callableStatement.setString("Firma", rFirma);
            callableStatement.setString("UserId", userID);
            callableStatement.setString("Liczba", liczba);


            callableStatement.registerOutParameter("rStatus", java.sql.Types.INTEGER);
            callableStatement.registerOutParameter("rKomunikat", java.sql.Types.VARCHAR);
            callableStatement.registerOutParameter("rCzyParzysta", java.sql.Types.VARCHAR);

            callableStatement.execute();
            rStatus = callableStatement.getString("rStatus");
            rKomunikat = callableStatement.getString("rKomunikat");
            rCzyParzysta = callableStatement.getString("rCzyParzysta");

            Log.i("laczenie", "rStatus: " + rStatus);
            Log.i("laczenie", "rKomunikat: " + rKomunikat);
            Log.i("laczenie", "rCzyParzysta: " + rCzyParzysta);

                callableStatement.close();
                connection.close();
            } catch(Exception e){
//            e.printStackTrace();
                Log.i("laczenie", "exception " + e.toString());
            }
            return finalResult;
        }
    }