package com.example.kalkulator_bd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void persegi(View view) {
        Intent myIntent = new Intent(MainActivity.this, Activity_persegi.class);
        startActivity(myIntent);
    }

    public void segitiga(View view) {
        Intent myIntent = new Intent(MainActivity.this, Activity_segitiga.class);
        startActivity(myIntent);
    }

    public void lingkaran(View view) {
        Intent myIntent = new Intent(MainActivity.this, Activity_lingkaran.class);
        startActivity(myIntent);
    }
}