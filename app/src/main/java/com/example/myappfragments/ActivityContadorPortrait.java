package com.example.myappfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityContadorPortrait extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador_portrait);
        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(iractivity1);




    }

    private View.OnClickListener iractivity1 = new View.OnClickListener() {

        @Override

        public void onClick(View view){

            Intent intent = new Intent(ActivityContadorPortrait.this,
                    MainActivity.class);

            startActivity(intent);
        }




    };


    protected void onStart() {

        super.onStart();

        Toast.makeText(this,"Iniciado activity 2",Toast.LENGTH_SHORT).show();



    }



}