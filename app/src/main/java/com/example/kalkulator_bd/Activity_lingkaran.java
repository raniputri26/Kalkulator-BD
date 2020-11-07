package com.example.kalkulator_bd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_lingkaran extends AppCompatActivity {

    TextView hasilLuas, hasilKeliling;
    Button hasil;
    EditText jari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        hasilLuas = (TextView) findViewById(R.id.tvHasilLuas);
        hasilKeliling = (TextView) findViewById(R.id.tvHasilKeliling);
        jari = (EditText) findViewById(R.id.etJari);
        hasil = (Button) findViewById(R.id.btnHasil);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double Jarijari, hasilL, hasilK;

                Jarijari = Double.valueOf(jari.getText().toString().trim());

                hasilL = 3.14*Jarijari*Jarijari;
                String hasilLs = String.valueOf(hasilL);
                hasilLuas.setText("Luas = "+hasilLs+"m2");

                hasilK = 3.14*2*Jarijari;
                String hasilKs = String.valueOf(hasilK);
                hasilKeliling.setText("Keliling = "+hasilKs+"m");
            }
        });
    }
}