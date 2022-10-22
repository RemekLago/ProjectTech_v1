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


            CallableStatement callableStatement = connection.prepareCall("{call [CzyLiczbaParzysta](?,?,?,?,?,?)}");
            Log.i("laczenie", "CallableStatement: " + callableStatement.toString());

            String id, rFirma = "700", userID = "0", liczba = "100";


            callableStatement.setString("Firma", rFirma);
            callableStatement.setString("UserId", userID);
            callableStatement.setString("Liczba", liczba);

            callableStatement.registerOutParameter("rStatus", Types.INTEGER);
            callableStatement.registerOutParameter("rKomunikat", Types.VARCHAR);
            callableStatement.registerOutParameter("rCzyParzysta", Types.VARCHAR);

//            ResultSet rs = callableStatement.executeQuery();
            int rs = callableStatement.executeUpdate();
            Log.i("laczenie", "rs = " + rs);

            callableStatement.executeUpdate();

//            while (rs.next()) {
//                String pozycja = rs.getString("Pozycja").trim();
//                String nazwapozycja = rs.getString("PozycjaNazwa").trim();
//                ArrayList<Object> tmpReckord = new ArrayList();
//                tmpReckord.add(pozycja);
//                tmpReckord.add(nazwapozycja);
//
//                Log.i("laczenie", "ArrayLisy(pozycja): " + tmpReckord.get(0));
//                Log.i("laczenie", "ArrayList(nazwapozycja): " + tmpReckord.get(1));
//
//                finalResult.add(tmpReckord);
//
//                Log.i("laczenie", "HashMap:" + finalResult.get(0).get(0));
//          Log.i("laczenie", "HashMap:" + finalResult.get(0).get(1));
//            }


                callableStatement.close();
                connection.close();
            } catch(Exception e){
//            e.printStackTrace();
                Log.i("laczenie", "exception " + e.toString());
            }
            return finalResult;
        }
    }