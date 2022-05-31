package com.example.unq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button iniciar_sesion = findViewById(R.id.iniciar_sesion);
        iniciar_sesion.setOnClickListener(this);

        Button registrarse = findViewById(R.id.button_registro);
        registrarse.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iniciar_sesion:
                startActivity(new Intent(this,Menu.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.button_registro:
                startActivity(new Intent(this,Registro.class));
                break;
            case R.id.turno:
                startActivity(new Intent(this,Cafeterias.class));
                break;
        }
    }
}


