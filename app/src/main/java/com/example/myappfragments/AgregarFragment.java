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
 * A simple {@link Fragment} subclass.
 * Use the {@link AgregarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AgregarFragment extends Fragment {

    // abf 5-11-2023

    private OnContadorChangeListener mListener;
    private static int contador = 0;
    // Callback interface
    public interface OnContadorChangeListener {
        void onContadorChanged(int contador);
    }



    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnContadorChangeListener) {
            mListener = (OnContadorChangeListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnContadorChangeListener");
        }
    }


    // abf 5-11-2023




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AgregarFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment agregarFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AgregarFragment newInstance(String param1, String param2) {
        AgregarFragment fragment = new AgregarFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



   }



    //

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {






        // establecemos la vista al fragment agregar
        View vista = inflater.inflate(R.layout.fragment_agregar_portrait,container,false);

        // instanciamos un botón y lo asociamos al del fragment

        Button btnagregar = vista.findViewById(R.id.btnagregar);

        // al clicar irá al listener irafragmentcontador
      //  btnagregar.setOnClickListener(irafragmentcontador);
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

        public void onClick(View view){


            // usamos la variable  currentOrientation vara detectar la orientación del terminal

            int currentOrientation = getResources().getConfiguration().orientation;


            if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
                // Si está en vertical



                // abf 5-11-2023

                // Agregamos 1 al contador
                contador++;
                // cada vez que cambia el contador realizamos el callback para pasar
                // al parámetro al MainActivity
                if (mListener != null) {
                    mListener.onContadorChanged(contador);
                }

                //contadorPulsos.sumarContador();


                // abrimos el nuevo activity  vertical


          /*      Intent intent = new Intent(getActivity(),
                        ActivityContadorPortrait.class);


                startActivity(intent);*/

                // si está en horizontal

            } else {



                contadorPulsos.sumarContador();

                //refrescarContador();
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);



            }





        }




    };





    // instanciamos la clase ContadorPulsos y obtenemos la instancia iniciada
    ContadorPulsos contadorPulsos = ContadorPulsos.getInstancia();





}