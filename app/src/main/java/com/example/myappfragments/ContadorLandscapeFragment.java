package com.example.myappfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Fragment que contiene el texto en horizontal depende del Mainactivity
 */
public class ContadorLandscapeFragment extends Fragment {

    // declaramos el campo texto del contador que después será actualizado
    private TextView textContadorLand;


    public ContadorLandscapeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Cargamos la vista del fragment
        View vista = inflater.inflate(R.layout.fragment_contador_landscape, container, false);
        // asignamos el valor de la variable textContadorLand a la etiqueta
        textContadorLand = vista.findViewById(R.id.textContadorLand);


        return vista;

    }


    public void onResume() {
        super.onResume();

        /* cuando entra a trabajar el fragment landscape actualizamos el contador,
         por si es la primera vez que recive el foco y ya habian pulsaciones antes
         llamamos al metodo del MainActivity que tiene almacenado el contador
        */
        if (isAdded() && getActivity() != null) {
            int valor = ((MainActivity) getActivity()).getValorContador();
            actualizaContador(valor);

        }

    }

    // método que actualiza el valor de la etiqueta del contador.
    public void actualizaContador(int contador) {


        if (textContadorLand != null) {
            textContadorLand.setText(String.valueOf(contador));


        }
    }


}