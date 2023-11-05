package com.example.myappfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AgregarFragment.OnContadorChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }




    @Override
    public void onContadorChanged(int contador) {
        // Start ActivityContadorPortrait with the incremented contador value
        Intent intent = new Intent(this, ActivityContadorPortrait.class);
        intent.putExtra("VALOR_CONTADOR", contador);
        startActivity(intent);
    }






    @Override

    protected void onStart() {

        super.onStart();
        // simple toast para saber donde estamos.
        Toast.makeText(this,"Iniciado activity 1",Toast.LENGTH_SHORT).show();


        // comentamos la instancia al contador anterior
      //  ContadorPulsos contadorPulsos = ContadorPulsos.getInstancia();




    }


  // método para detectar la configuración horizontal o vertical
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {

        }
    }



}