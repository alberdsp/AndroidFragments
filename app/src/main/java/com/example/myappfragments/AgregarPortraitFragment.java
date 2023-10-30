package com.example.myappfragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AgregarPortraitFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AgregarPortraitFragment extends Fragment {





    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AgregarPortraitFragment() {
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
    public static AgregarPortraitFragment newInstance(String param1, String param2) {
        AgregarPortraitFragment fragment = new AgregarPortraitFragment();
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
        btnagregar.setOnClickListener(iractivity2);

        Text textcontador = getActivity().findViewById(R.id.textContadorPortrait);



        return vista;
    }

// método para ir al activity 2


    private View.OnClickListener iractivity2 = new View.OnClickListener() {

        @Override

        public void onClick(View view){


            int currentOrientation = getResources().getConfiguration().orientation;
            if (currentOrientation == Configuration.ORIENTATION_PORTRAIT) {
                // Portrait orientation


                contadorPulsos.sumarContador();
                //  Toast.makeText(getActivity(),contadorPulsos.getContador(),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getActivity(),
                        ContadorPortrait.class);


                startActivity(intent);


            } else if (currentOrientation == Configuration.ORIENTATION_LANDSCAPE) {
                // Landscape orientation

                contadorPulsos.sumarContador();





            } else {
                // Other orientations (e.g., square)
            }






        }




    };





    // instanciamos la clase ContadorPulsos y obtenemos la instancia iniciada
    ContadorPulsos contadorPulsos = ContadorPulsos.getInstancia();
    private View.OnClickListener irafragmentcontador = new View.OnClickListener() {



        @Override
//TODO    no esta claro el uso
        public void onClick(View view){





                // Creamos el nuevo fragment y la transacción
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                // Reemplazamos el fragment agregar por una instancia del contador
                transaction.replace(R.id.fragmentContainerAgregar, ContadorFragment.newInstance("", ""));

                // Commit la transacción
                transaction.commit();







        }


    };




}