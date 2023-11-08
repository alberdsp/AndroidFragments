package com.example.myappfragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


/**
 * Este es el MainActivity de la aplicación que contendrá dos fragments AgregarFragment
 * y ContadorLandscapeFragment
 */
public class MainActivity extends AppCompatActivity implements AgregarFragment.alCambiarelContador {

    // almacenamos las pulsaciones que vienen del fragment
    private static int valorContador = 0;

    // método para acceder al valor si es necesario
    public int getValorContador() {
        return valorContador;
    }

    public void setValorContador(int valorContador) {

        this.valorContador = valorContador;

    }


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

        setValorContador(contador);


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


}