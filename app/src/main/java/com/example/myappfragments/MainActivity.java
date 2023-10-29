package com.example.myappfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }



    @Override

    protected void onStart() {

        super.onStart();

        Toast.makeText(this,"Iniciado activity 1",Toast.LENGTH_SHORT).show();



    }
}