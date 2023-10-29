package com.example.myappfragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link agregarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class agregarFragment extends Fragment {





    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public agregarFragment() {
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
    public static agregarFragment newInstance(String param1, String param2) {
        agregarFragment fragment = new agregarFragment();
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



            // Establecemos opaco el color de fondo
        container.setAlpha(1.0f); // Set to 100% opacity

        // establecemos la vista al fragment agregar
        View vista = inflater.inflate(R.layout.fragment_agregar,container,false);

        // instanciamos un botón y lo asociamos al del fragment

        Button btnagregar = vista.findViewById(R.id.btnagregar);

        // al clicar irá al listener irafragmentcontador
        btnagregar.setOnClickListener(irafragmentcontador);






        return vista;
    }



    // creamos el listener para pasar de fragment

    private View.OnClickListener irafragmentcontador = new View.OnClickListener() {



        @Override

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