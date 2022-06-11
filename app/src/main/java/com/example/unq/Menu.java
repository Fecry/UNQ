package com.example.unq;

import static com.example.unq.MainActivity.us1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java_clases.Estructuras.Colas;

public class Menu extends AppCompatActivity implements View.OnClickListener {
    public static Colas<Integer> central= new Colas<>("central");
    public static Colas<Integer> biologia = new Colas<>("biologia");
    public static Colas<Integer> yuTakeuchi = new Colas<>("yuTakeuchi");
    public static Colas<Integer> medicina = new Colas<>("medicina");
    public static Colas<Integer> agronomia = new Colas<>("agronomia");
    public static Colas<Integer> hemeroteca = new Colas<>("hemeroteca");
    public static Colas<Integer> economia = new Colas<>("economia");

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
                int [] cafeterias = new int[] {central.getCount(),biologia.getCount(),yuTakeuchi.getCount(),medicina.getCount(),agronomia.getCount(),economia.getCount()};

                for(int j = 0; j < cafeterias.length; j++){
                    System.out.println(cafeterias[j]);
                }

                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + cafeterias.toString());
                int min = 0;

                System.out.println("EEEEEEEEEEEEEEEEEEEEEEEE" + min);

                int cafeteria_escogida = 0;
                String nombre;

                for(int i = 0; i < cafeterias.length; i++){
                    if(cafeterias[i] > min){
                        min = cafeterias[i];
                        cafeteria_escogida = i;
                        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOO" + cafeteria_escogida);
                    }
                }
                switch (cafeteria_escogida){
                    case 1:
                        central.enqueue(Integer.parseInt(us1.getId()));
                        nombre = "Central";
                        System.out.println(central.tiempo());
                        startActivity(new Intent(this,TiempoEstimado.class).putExtra("cafeteria",central.tiempo()).putExtra("nombre",nombre));
                        break;
                    case 2:
                        biologia.enqueue(Integer.parseInt(us1.getId()));
                        nombre = "Biología";
                        startActivity(new Intent(this,TiempoEstimado.class).putExtra("cafeteria",biologia.tiempo()).putExtra("nombre",nombre));
                        break;
                    case 3:
                        yuTakeuchi.enqueue(Integer.parseInt(us1.getId()));
                        nombre = "YuTakeuchi";
                        startActivity(new Intent(this,TiempoEstimado.class).putExtra("cafeteria",yuTakeuchi.tiempo()).putExtra("nombre",nombre));
                        break;
                    case 4:
                        agronomia.enqueue(Integer.parseInt(us1.getId()));
                        nombre = "Agronomía";
                        startActivity(new Intent(this,TiempoEstimado.class).putExtra("cafeteria",agronomia.tiempo()).putExtra("nombre",nombre));
                        break;
                    case 5:
                        medicina.enqueue(Integer.parseInt(us1.getId()));
                        nombre = "Medicina";
                        startActivity(new Intent(this,TiempoEstimado.class).putExtra("cafeteria",medicina.tiempo()).putExtra("nombre",nombre));
                        break;
                    case 6:
                        economia.enqueue(Integer.parseInt(us1.getId()));
                        nombre = "Economía";
                        startActivity(new Intent(this,TiempoEstimado.class).putExtra("cafeteria",economia.tiempo()).putExtra("nombre",nombre));
                        break;
                }
                break;
            case R.id.turno:
                startActivity(new Intent(this,Cafeterias.class));
                break;
            case R.id.eliminar_turno:
                Toast toast1 = Toast.makeText(getApplicationContext(), "Esto debe cancelar turno", Toast.LENGTH_SHORT);
                toast1.show();
                //startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}