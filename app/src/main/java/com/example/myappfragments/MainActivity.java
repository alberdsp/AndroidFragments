package com.example.myappfragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements AgregarFragment.alCambiarelContador {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    /* sobrescribimos el método para pasar el valor del contador al fragment
       cada vez que cambia, entendemos que se ha pulsado el botón y abre el activityContadorPortrait
       si es horizontal llama al método del fragment para actualzar el contador.
     */


    @Override

    public void contadorCambiado(int contador) {

        int currentOrientation = getResources().getConfiguration().orientation;
        ContadorLandscapeFragment landscapeFragment = (ContadorLandscapeFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerViewLand);

        if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {

            // Abrimos el activityContador y le pasamos los datos del contador.
            Intent intent = new Intent(this, ActivityContadorPortrait.class);
            intent.putExtra("VALOR_CONTADOR", contador);
            startActivity(intent);


            // si está en horizontal

        } else {

            landscapeFragment.actualizaContador(contador);


        }


    }


    @Override

    protected void onStart() {

        super.onStart();
        // simple toast para saber donde estamos.
        Toast.makeText(this, "Iniciado activity 1", Toast.LENGTH_SHORT).show();

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