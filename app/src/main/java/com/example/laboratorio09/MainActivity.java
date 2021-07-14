package com.example.laboratorio09;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Camera;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pasar(View view){
        Intent intent = new Intent(this, Camara.class);
        startActivity(intent);
    }
    public void pasarIntent(View view){
        Intent intent = new Intent(this, CamaraIntent.class);
        startActivity(intent);
    }
}