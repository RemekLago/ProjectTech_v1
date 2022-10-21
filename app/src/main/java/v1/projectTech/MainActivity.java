package v1.projectTech;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Connection to database
    String user = "MobiTech",
            pass = "M0b1T3ch",
            db = "MobiTech",
            ip = "192.168.1.41",
            port = "51558";
    String URL = "jdbc:jtds:sqlserver://"+ip+":"+port+"/"+db;
//
//    String QR_Code = "WYGPZ2201681|         1897 013 05|0,300|0|S300-2205||562105_1|749955|NEW|||124/A/05/22||||20.05.22|||||||";
//
//
//    public ArrayList<List> Pozycja_Informacje() {
//        ArrayList<List> final_result_list = null;
//        ArrayList<String> result_one_position = null;
//        Connection connection;
//
//            try {
//                connection = DriverManager.getConnection(URL, user, pass);
//                CallableStatement callableStatement = connection.prepareCall("{call MT_Public_Pozycja_Informacje (?,?,?)}");
//                callableStatement.setInt(1, 0);
//                callableStatement.setInt("Firma", 750);
//                callableStatement.setInt("UserId", 0);
//                callableStatement.setInt("Barcode", Integer.parseInt(QR_Code));
//
//
//                ResultSet resultOfQuery = callableStatement.executeQuery();
//
//                while (resultOfQuery.next()) {
//                    for (int i=0; i < 10; i++) {
//                    result_one_position.add(resultOfQuery.getString(i));
//                        System.out.println(resultOfQuery.getString(i));
//                    }
//                    final_result_list.add(result_one_position);
//                }
//                callableStatement.close();
//                connection.close();
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//                Log.i("Sprawdzanie", "SQL error");
//            }
//
//            return final_result_list;
//    }

    @SuppressLint("WrongThread")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectDiskReads()
                    .detectDiskWrites()
                    .detectNetwork()   // or .detectAll() for all detectable problems
                    .penaltyLog()
                    .build());
        }
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        DBTest dbtest = new DBTest();
        ArrayList<ListItems> tempItemList = dbtest.doInBackground();

        Log.i("laczenie", "url adress: " + URL.toString());

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
//        Log.i("laczenie", "url adress: " + tempItemList.);
//        Log.i("laczenie", "url adress: " + tempItemList.g);
//        textView1.setText((CharSequence) tempItemList.get(0));
//        textView2.setText((CharSequence) tempItemList.get(1));
    }

}