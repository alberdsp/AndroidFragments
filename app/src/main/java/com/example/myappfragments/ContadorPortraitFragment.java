package com.example.myappfragments;

import static android.content.Intent.getIntent;
import static com.example.myappfragments.R.id.textContadorPortrait;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Fragment que contiene el texto contador en vertical
 */
public class ContadorPortraitFragment extends Fragment {

    // declaramos el textview del contador
    private TextView textContadorPortrait;


    public ContadorPortraitFragment() {
        // constructor por defecto
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // cargamos la vista referenciando al fragment_contador_potrait.xml y el textContador del mismo
        View vista = inflater.inflate(R.layout.fragment_contador_portrait, container, false);
        textContadorPortrait = vista.findViewById(R.id.textContadorPortrait);


        //  recogemos el valor del activity principal y lo mostramos a traves del metodo contador
        // del activity

        if (getActivity() instanceof ActivityContadorPortrait) {
            ActivityContadorPortrait activitycontador = (ActivityContadorPortrait) getActivity();
            textContadorPortrait.setText(activitycontador.getContador());

        }

        return vista;
    }


}
