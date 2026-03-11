package com.example.clasefca3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaActividad extends AppCompatActivity {

    TextView txvTitulo;
    Button btnIncrementa;

    int contador = 0;

    String MI_LLAVE = "actividad.segunda.miLlave";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        txvTitulo = findViewById(R.id.txvTitulo);
        btnIncrementa = findViewById(R.id.btnIncrementa);

        if (savedInstanceState != null && savedInstanceState.containsKey(MI_LLAVE)) {
            contador = savedInstanceState.getInt(MI_LLAVE);
            muestraTitulo();
        }

        btnIncrementa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador += 1;
                muestraTitulo();
            }
        });
        Log.i("FCA", "onCreate() executed");
    }

    private void muestraTitulo() {
        txvTitulo.setText("" + contador);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("FCA", "onStart() executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("FCA", "onResume() executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("FCA", "onRestart() executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("FCA", "onPause() executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("FCA", "onDestroy() executed");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(MI_LLAVE, contador);
    }
}
