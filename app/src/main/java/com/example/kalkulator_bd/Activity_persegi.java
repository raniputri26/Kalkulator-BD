package com.example.kalkulator_bd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_persegi extends AppCompatActivity {

    TextView hasilLuas,hasilKeliling;
    Button hasil;
    EditText sisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        hasilLuas = (TextView) findViewById(R.id.tvHasilLuas);
        hasilKeliling = (TextView) findViewById(R.id.tvHasilKeliling);
        sisi = (EditText) findViewById(R.id.etSisi);
        hasil = (Button) findViewById(R.id.btnHasil);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = sisi.getText().toString();

                if(s.length()!=0){
                    String hLuas = luas(s);
                    String hKeliling = keliling(s);
                    hasilLuas.setText("Luas ="+hLuas+"m2");
                    hasilKeliling.setText("Keliling ="+hKeliling+"m");
                }else{

                }
            }
        });
    }

    private void show() {
    }

    private String luas(String s){
        Double dl = Double.parseDouble(s);
        Double dLuas = dl*dl;
        String dHasil = String.valueOf(dLuas);
        return dHasil;
    }
    private String keliling (String s){
        Double dl = Double.parseDouble(s);
        Double dKeliling = 4*dl;
        String dHasil = String.valueOf(dKeliling);
        return dHasil;
    }

}