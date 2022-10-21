package v1.projectTech;

import android.os.AsyncTask;
import android.util.Log;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBTest extends AsyncTask<String, Void, ArrayList<ArrayList>> {

    ArrayList<ArrayList> finalResult = new ArrayList<>();

    @Override
    protected ArrayList<ArrayList> doInBackground(String... strings) {

        try {
            String user = "MobiTech",
                    pass = "M0b1T3ch",
                    db = "MobiTech",
                    ip = "192.168.1.41",
                    port = "51558";
            String URL = "jdbc:jtds:sqlserver://" + ip + ":" + port + "/" + db;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection connection = DriverManager.getConnection(URL, user, pass);
            Log.i("laczenie", "Connected to: " + connection.toString());


//            Statement statement = connection.createStatement();
//            String queryString = "select [Firma], [Pozycja] from [MobiTech.dbo.]";

            CallableStatement callableStatement = connection.prepareCall("{call [PozycjaPozycjaNazwa](?,?,?)}");
            Log.i("laczenie", "CallableStatement: " + callableStatement.toString());

            String id, rFirma = "750", userID = "0";
            int Koniec = 4;

            callableStatement.setString("Firma", rFirma);
            callableStatement.setString("UserId", userID);
            callableStatement.setInt("Koniec", Koniec);


//            callableStatement.registerOutParameter(1, Types.VARCHAR);
//            callableStatement.registerOutParameter(2, Types.VARCHAR);
//            callableStatement.registerOutParameter(2, Types.VARCHAR);


            ResultSet rs = callableStatement.executeQuery();

            while (rs.next()) {
                String pozycja = rs.getString("Pozycja").trim();
                String nazwapozycja = rs.getString("PozycjaNazwa").trim();
                ArrayList<Object> tmpReckord = new ArrayList();
                tmpReckord.add(pozycja);
                tmpReckord.add(nazwapozycja);

                Log.i("laczenie", "ArrayLisy(pozycja): " + tmpReckord.get(0));
                Log.i("laczenie", "ArrayList(nazwapozycja): " + tmpReckord.get(1));

                finalResult.add(tmpReckord);

                Log.i("laczenie", "HashMap:" + finalResult.get(0).get(0));
                Log.i("laczenie", "HashMap:" + finalResult.get(0).get(1));
            }


            callableStatement.close();
            connection.close();
        } catch (Exception e) {
//            e.printStackTrace();
            Log.i("laczenie", "exception " + e.toString());
        }
        return finalResult;
    }
}