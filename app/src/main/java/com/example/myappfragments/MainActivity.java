package com.example.myappfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }






    @Override

    protected void onStart() {

        super.onStart();
        // simple toast para saber donde estamos.
        Toast.makeText(this,"Iniciado activity 1",Toast.LENGTH_SHORT).show();

        ContadorPulsos contadorPulsos = ContadorPulsos.getInstancia();




    }



    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            // Handle portrait orientation
        }
    }



}