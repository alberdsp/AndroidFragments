package com.example.myappfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


/**
 * este es el segundo activity en vertical que contendra el fragment con el contador en vertical
 */
public class ActivityContadorPortrait extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador_portrait);
        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(cerrarActivity);


    }


    // método para cerrar el activity actual
    private View.OnClickListener cerrarActivity = new View.OnClickListener() {

        @Override

        public void onClick(View view) {
            finish();
        }


    };


    protected void onStart() {

        super.onStart();


        Toast.makeText(this, "Iniciado activity 2", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onResume() {
        super.onResume();


    }


    // método que nos devuelve el valor del contador que nos ha pasado el
    //MainActivity


    public String getContador() {

        int contador = 0;


        contador = getIntent().getIntExtra("VALOR_CONTADOR", -1);


        return String.valueOf(contador);


    }


}