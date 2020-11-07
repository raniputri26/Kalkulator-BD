package com.example.kalkulator_bd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_segitiga extends AppCompatActivity {

    TextView hasilLuas, hasilKeliling;
    Button hasil;
    EditText alas;
    EditText tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        hasilLuas = (TextView) findViewById(R.id.tvHasilLuas);
        hasilKeliling = (TextView) findViewById(R.id.tvHasilKeliling);
        alas = (EditText) findViewById(R.id.etAlas);
        tinggi = (EditText) findViewById(R.id.etTinggi);
        hasil = (Button) findViewById(R.id.btnHasil);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double nilAlas, nilTinggi, hasilL, hasilK;

                nilAlas = Double.valueOf(alas.getText().toString().trim());
                nilTinggi = Double.valueOf(tinggi.getText().toString().trim());

                hasilL = (nilAlas/2)*nilTinggi;
                String hasilLs = String.valueOf(hasilL);
                hasilLuas.setText("Luas = "+hasilLs+"m2");

                hasilK = nilAlas+nilAlas+nilAlas;
                String hasilKs = String.valueOf(hasilK);
                hasilKeliling.setText("Keliling = "+hasilKs+"m");


            }
        });
    }
}