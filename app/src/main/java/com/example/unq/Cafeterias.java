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
import android.widget.ImageButton;
import android.widget.Toast;

import java_clases.Estructuras.Colas;

public class Cafeterias extends AppCompatActivity implements View.OnClickListener {
    public static String nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeterias);




        ImageButton central_image = findViewById(R.id.central);
        central_image.setOnClickListener(this);

        ImageButton biologia_image  = findViewById(R.id.biologia );
        biologia_image.setOnClickListener(this);

        ImageButton yu_image = findViewById(R.id.yu);
        yu_image.setOnClickListener(this);

        ImageButton agronomia_image = findViewById(R.id.agronomia);
        agronomia_image.setOnClickListener(this);

        ImageButton medicina_image = findViewById(R.id.medicina);
        medicina_image.setOnClickListener(this);

        ImageButton economia_image = findViewById(R.id.economia);
        economia_image.setOnClickListener(this);

        Button cancelar = findViewById(R.id.cancelar);
        cancelar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.central:
                central.enqueue(Integer.parseInt(us1.getId()));
                nombre = "Central";

                /*
                central.enqueue(2);
                central.enqueue(3);
                central.enqueue(4);
                central.enqueue(5);
                central.enqueue(6);
                central.enqueue(7);
                central.enqueue(8);
                central.enqueue(9);
                central.enqueue(10);
                central.enqueue(11);

                 */
                System.out.println(central.tiempo());
                startActivity(new Intent(this,TiempoEstimado.class).putExtra("cafeteria",central.tiempo()).putExtra("nombre",nombre));

                break;
            case R.id.biologia:
                biologia.enqueue(Integer.parseInt(us1.getId()));
                nombre = "Biología";
                startActivity(new Intent(this,TiempoEstimado.class).putExtra("cafeteria",biologia.tiempo()).putExtra("nombre",nombre));
                break;
            case R.id.yu:
                yuTakeuchi.enqueue(Integer.parseInt(us1.getId()));
                nombre = "YuTakeuchi";
                startActivity(new Intent(this,TiempoEstimado.class).putExtra("cafeteria",yuTakeuchi.tiempo()).putExtra("nombre",nombre));
                break;
            case R.id.agronomia:
                agronomia.enqueue(Integer.parseInt(us1.getId()));
                nombre = "Agronomía";
                startActivity(new Intent(this,TiempoEstimado.class).putExtra("cafeteria",agronomia.tiempo()).putExtra("nombre",nombre));
                break;
            case R.id.medicina:
                medicina.enqueue(Integer.parseInt(us1.getId()));
                nombre = "Medicina";
                startActivity(new Intent(this,TiempoEstimado.class).putExtra("cafeteria",medicina.tiempo()).putExtra("nombre",nombre));
                break;
            case R.id.economia:
                economia.enqueue(Integer.parseInt(us1.getId()));
                nombre = "Economía";
                startActivity(new Intent(this,TiempoEstimado.class).putExtra("cafeteria",economia.tiempo()).putExtra("nombre",nombre));
                break;
            case R.id.cancelar:
                Toast toast1 = Toast.makeText(getApplicationContext(), "Esto debe volver", Toast.LENGTH_SHORT);
                finish();
                toast1.show();
                break;

        }
    }
}