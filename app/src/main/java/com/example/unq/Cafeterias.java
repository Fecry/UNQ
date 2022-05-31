package com.example.unq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Cafeterias extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeterias);

        ImageButton central = findViewById(R.id.central);
        central.setOnClickListener(this);

        ImageButton biologia  = findViewById(R.id.biologia );
        biologia.setOnClickListener(this);

        ImageButton yu = findViewById(R.id.yu);
        yu.setOnClickListener(this);

        //ImageButton medicina = findViewById(R.id.medicina);
        //medicina.setOnClickListener(this);

        ImageButton agronomia = findViewById(R.id.agronomia);
        agronomia.setOnClickListener(this);

        ImageButton medicina = findViewById(R.id.medicina);
        medicina.setOnClickListener(this);

        ImageButton economia = findViewById(R.id.economia);
        economia.setOnClickListener(this);

        Button cancelar = findViewById(R.id.cancelar);
        cancelar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.central:
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.biologia:
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.yu:
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.agronomia:
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.medicina:
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.economia:
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.cancelar:
                Toast toast1 = Toast.makeText(getApplicationContext(), "Esto debe volver", Toast.LENGTH_SHORT);
                toast1.show();
                break;

        }
    }
}