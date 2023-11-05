package com.example.myappfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContadorLandscapeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContadorLandscapeFragment extends Fragment {

    // declaramos el campo texto del contador que después será actualizado
    private TextView textContadorLand;




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ContadorLandscapeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContadorPortaitFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContadorLandscapeFragment newInstance(String param1, String param2) {
        ContadorLandscapeFragment fragment = new ContadorLandscapeFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Cargamos la vista del fragment
        View vista = inflater.inflate(R.layout.fragment_contador_landscape, container, false);
        // asignamos el valor de la variable textContadorLand a la etiqueta
        textContadorLand = vista.findViewById(R.id.textContadorLand);

        return vista;

    }




    public void onResume() {
        super.onResume();



    }



    // método que actualiza el valor de la etiqueta del contador.
    public void actualizaContador(int contador) {


        if (textContadorLand != null) {
            textContadorLand.setText(String.valueOf(contador));


        }
    }
}