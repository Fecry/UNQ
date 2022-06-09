package com.example.unq;

import static com.example.unq.MainActivity.us1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java_clases.Estructuras.Colas;

public class Cafeterias extends AppCompatActivity implements View.OnClickListener {

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
        Colas<Integer> central = new Colas<>();
        Colas<Integer> biologia = new Colas<>();
        Colas<Integer> yuTakeuchi = new Colas<>();
        Colas<Integer> medicina = new Colas<>();
        Colas<Integer> agronomia = new Colas<>();
        Colas<Integer> hemeroteca = new Colas<>();
        Colas<Integer> economia = new Colas<>();
        switch (view.getId()){
            case R.id.central:
                central.enqueue(Integer.parseInt(us1.getId()));
                //JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería Central");
                //JOptionPane.showMessageDialog(null, central.tiempo());
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.biologia:
                biologia.enqueue(Integer.parseInt(us1.getId()));
                //JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería en biología");
                //JOptionPane.showMessageDialog(null, biologia.tiempo());
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.yu:
                yuTakeuchi.enqueue(Integer.parseInt(us1.getId()));
                //JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería Yu Takeuchi");
                //JOptionPane.showMessageDialog(null, yuTakeuchi.tiempo());
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.agronomia:
                agronomia.enqueue(Integer.parseInt(us1.getId()));
                //JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería en agronomía");
                //JOptionPane.showMessageDialog(null, agronomia.tiempo());
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.medicina:
                medicina.enqueue(Integer.parseInt(us1.getId()));
                //JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería en medicina\n\n" + medicina.tiempo()+"\n");
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.economia:
                economia.enqueue(Integer.parseInt(us1.getId()));
                //JOptionPane.showMessageDialog(null, "Estás en la cola para la cafetería en economía");
                //JOptionPane.showMessageDialog(null, economia.tiempo());
                startActivity(new Intent(this,TiempoEstimado.class));
                System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                break;
            case R.id.cancelar:
                Toast toast1 = Toast.makeText(getApplicationContext(), "Esto debe volver", Toast.LENGTH_SHORT);
                startActivity(new Intent(this,Menu.class));
                toast1.show();
                break;

        }
    }
}