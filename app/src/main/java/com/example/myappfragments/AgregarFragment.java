package com.example.myappfragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.w3c.dom.Text;


/**
 * Fragment que contiene el botón de agregar, depende del MainFragment
 */
public class AgregarFragment extends Fragment {

    // abf 5-11-2023

    private alCambiarelContador mListener;
    private static int contador = 0;


    // anclamos el la interfaz al fragment y comprobamos si es instancia
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof alCambiarelContador) {
            mListener = (alCambiarelContador) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " ");
        }
    }


    public AgregarFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    //

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // establecemos la vista al fragment agregar
        View vista = inflater.inflate(R.layout.fragment_agregar_portrait, container, false);

        // instanciamos un botón y lo asociamos al del fragment

        Button btnagregar = vista.findViewById(R.id.btnagregar);


        // al pulsar vamos al activity2
        btnagregar.setOnClickListener(subeContador);

        Text textcontador = getActivity().findViewById(R.id.textContadorLand);


        return vista;
    }





    /*
     subeContador metódo que subirá el contador en el activity2 si está en Portrait o
  en el mísmo activity si está en Landscape
 */

    private View.OnClickListener subeContador = new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            // Agregamos 1 al contador
            contador++;
            // cada vez que cambia el contador realizamos el callback para pasar
            // al parámetro al MainActivity
            //devolvemos el callback al MainActivity
            if (mListener != null) {
                mListener.contadorCambiado(contador);
            }


        }


    };


    // Declaramos la interfaz Callback que será después implementada
    public interface alCambiarelContador {
        void contadorCambiado(int contador);
    }


}