package com.example.unq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button turno_rapido = findViewById(R.id.turno_rapido);
        turno_rapido.setOnClickListener(this);

        Button turno = findViewById(R.id.turno);
        turno.setOnClickListener(this);

        Button eliminar_turno = findViewById(R.id.eliminar_turno);
        eliminar_turno.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.turno_rapido:
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.turno:
                startActivity(new Intent(this,Cafeterias.class));
                break;
            case R.id.eliminar_turno:
                Toast toast1 = Toast.makeText(getApplicationContext(), "Esto debe cancelar turno", Toast.LENGTH_SHORT);
                toast1.show();
                startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}