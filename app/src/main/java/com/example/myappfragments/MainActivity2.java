package com.example.myappfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(iractivity1);




    }

    private View.OnClickListener iractivity1 = new View.OnClickListener() {

        @Override

        public void onClick(View view){

            Intent intent = new Intent(MainActivity2.this,
                    MainActivity.class);

            startActivity(intent);
        }




    };





}