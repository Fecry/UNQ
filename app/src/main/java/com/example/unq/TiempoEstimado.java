package com.example.unq;

import static com.example.unq.MainActivity.us1;
import static com.example.unq.Menu.central;
import static com.example.unq.Menu.biologia;
import static com.example.unq.Menu.yuTakeuchi;
import static com.example.unq.Menu.agronomia;
import static com.example.unq.Menu.medicina;
import static com.example.unq.Menu.economia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import static com.example.unq.Cafeterias.nombre;
import java_clases.Estructuras.Colas;

public class TiempoEstimado extends AppCompatActivity implements View.OnClickListener {

    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiempo_estimado);

        Button cancelar_turno = findViewById(R.id.cancelar_turno);
        cancelar_turno.setOnClickListener(this);

        TextView tiempo_estimado = findViewById(R.id.tiempo_estimado);
        TextView texto_cafeteria = findViewById(R.id.nombre_cafeteria);


        bundle = getIntent().getExtras();

        String cafeteria = bundle.getString("cafeteria");
        String nombre = bundle.getString("nombre");

        //Colas<Integer> cafeteria =(Colas<Integer>) bundle.getParcelable("cafeteria");

        tiempo_estimado.setText(cafeteria);
        texto_cafeteria.setText("Cafetería " + nombre);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cancelar_turno:
                Toast toast1 = Toast.makeText(getApplicationContext(), "Turno cancelado", Toast.LENGTH_SHORT);
                switch (nombre){
                    case "Central":
                        central.dequeue();
                        toast1.show();
                        finish();
                        break;
                    case "Biología":
                        biologia.dequeue();
                        toast1.show();
                        finish();
                        break;
                    case "YuTakeuchi":
                        yuTakeuchi.dequeue();
                        toast1.show();
                        finish();
                        break;
                    case "Agronomía":
                        agronomia.dequeue();
                        toast1.show();
                        finish();
                        break;
                    case "Medicina":
                        medicina.dequeue();
                        toast1.show();
                        finish();
                        break;
                    case "Economía":
                        economia.dequeue();
                        toast1.show();
                        finish();
                        break;
                }


                break;
        }
    }
}