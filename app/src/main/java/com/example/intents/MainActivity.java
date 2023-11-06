package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.app.Activity;
import android.app.DownloadManager;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1, b2 ,b3,b4;
        TextView textBuscar = findViewById(R.id.textBuscar);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);



        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
    //Obrim l'activitat 2 amb el Intent
        //Button b=(Button)

        if(view.getId()==R.id.b1)
        {
            Intent intent1 = new Intent(this, MainActivity2.class);
            startActivity(intent1);
        }
        else if(view.getId()==R.id.b2)
        {
            Intent intent2= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:112"));
            startActivity(intent2);
        }
        else if(view.getId()==R.id.b3)
        {
            Intent intent3= new Intent(Intent.ACTION_VIEW, Uri.parse("geo:2,2,1"));
            startActivity(intent3);
        }
        else if(view.getId()==R.id.b4)
        {
            Intent intent4=new Intent(Intent.ACTION_WEB_SEARCH);
            //intent4.putExtra(SearchManager.QUERY, textBuscar);
            startActivity(intent4);
        }
        else if(view.getId()==R.id.b6)


    }
}

