package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle sacRebut=getIntent().getExtras();

        String nom= sacRebut.getString("nomLogin");
        TextView nom= findViewById(R.id.textNom);
        nom.setText("Hola" + nom);

    }
}