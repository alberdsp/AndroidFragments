package com.example.myappfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;




/*
este es el segundo activity en vertical que contendra el fragment con el contador en vertical
 */
public class ActivityContadorPortrait extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador_portrait);
        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(iraMainActivity);




    }
// método para volver al MainActivity
    private View.OnClickListener iraMainActivity = new View.OnClickListener() {

        @Override

        public void onClick(View view){

            Intent intent = new Intent(ActivityContadorPortrait.this,
                    MainActivity.class);

            startActivity(intent);
        }




    };


    protected void onStart() {

        super.onStart();
        // simple toast para saber donde estamos.
        Toast.makeText(this,"Iniciado activity 2",Toast.LENGTH_SHORT).show();



    }



}