package com.example.myappfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instaciamos el botón de cambio de actividad
 /*       Button btnactivity2 = findViewById(R.id.btnactivity2);
        btnactivity2.setOnClickListener(iractivity2);
*/



    }
/*    private View.OnClickListener iractivity2 = new View.OnClickListener() {

        @Override

        public void onClick(View view){

            Intent intent = new Intent(MainActivity.this,
                    MainActivity2.class);

               startActivity(intent);
        }




    };*/
/*


    private View.OnClickListener irafragmentcontador = new View.OnClickListener() {

        @Override

        public void onClick(View view){

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerAgregar, ContadorFragment.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("cambio") // Name can be null
                    .commit();




        }




    };
*/






    @Override

    protected void onStart() {

        super.onStart();

        Toast.makeText(this,"Iniciado activity 1",Toast.LENGTH_SHORT).show();



    }







}