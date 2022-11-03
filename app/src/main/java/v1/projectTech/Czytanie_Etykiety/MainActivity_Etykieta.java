package v1.projectTech.Czytanie_Etykiety;

import static v1.projectTech.Czytanie_Etykiety.Procedura_Magazyn_Pozycje_Lokalizacje.takingLocalizationPosition;
import static v1.projectTech.Czytanie_Etykiety.Procedura_Pozycja_Informacje.Barcode;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.HashMap;
import v1.projectTech.BuildConfig;
import v1.projectTech.R;


public class MainActivity_Etykieta extends AppCompatActivity {

    static HashMap<String, String> Result1;

    @SuppressLint("WrongThread")
    @Override
    protected void onCreate (Bundle savedInstanceState){

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectDiskReads()
                    .detectDiskWrites()
                    .detectNetwork()   // or .detectAll() for all detectable problems
                    .penaltyLog()
                    .build());
        }
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_etykieta);


        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity_table();
            }});



        //start method takingPositionInformation() from Package: Procedura_Pozycja_Informacje
        Result1 = Procedura_Pozycja_Informacje.takingPositionInformation();

        //set data from Result1 into TextViews to show in layout
        TextView textView_Status = findViewById(R.id.textView_Status);
        TextView textView_Komunikat = findViewById(R.id.textView_Komunikat);
        TextView textView_NazwaPozycja = findViewById(R.id.textView_NazwaPozycja);
        TextView textView_Pozycja = findViewById(R.id.textView_Pozycja);
        TextView textView_Barcode = findViewById(R.id.textView_Barcode);

        textView_Status.setText(Result1.get("Status"));
        textView_Komunikat.setText(Result1.get("Komunikat"));
        textView_NazwaPozycja.setText( Result1.get("PozycjaNazwa"));
        textView_Pozycja.setText(Result1.get("Pozycja"));
        textView_Barcode.setText(Barcode);

        //
        takingLocalizationPosition();
    }

    // method with Intend allows to go to the next layout/activity
    private void openMainActivity_table() {
        Intent intent = new Intent(this, MainActivity_Table.class);
        startActivity(intent);
    }
}