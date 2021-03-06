package com.example.unq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java_clases.Estructuras.DynamicArray;

import java_clases.main.Usuario;
import java_clases.main.Text;
import java_clases.main.Serializacion;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static Usuario us1 = new Usuario("", "");
    public static Serializacion serializacion = new Serializacion();
    public static DynamicArray<Usuario> BdD;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button iniciar_sesion = findViewById(R.id.iniciar_sesion);
        iniciar_sesion.setOnClickListener(this);

        Button registrarse = findViewById(R.id.button_registro);
        registrarse.setOnClickListener(this);

        BdD = new DynamicArray<>();

        serializacion.deserializar(getApplicationContext());
    }

    public void onStart() {
        super.onStart();
        serializacion.deserializar(getApplicationContext());
    }

    public void onResume(){
        super.onResume();
        serializacion.deserializar(getApplicationContext());
    }

        @Override
        public void onClick (View view){

            switch (view.getId()) {
                case R.id.iniciar_sesion:
                    //boolean seguir = false;

                    EditText documento = findViewById(R.id.identificacion_iniciar_sesion);
                    EditText contrasena = findViewById(R.id.contrasena_iniciar_sesion);

                    String doc = documento.getText().toString();
                    String ctr = contrasena.getText().toString();
                    us1 = new Usuario(doc, ctr);
                    //Toast toast = Toast.makeText(getApplicationContext(), "Exito", Toast.LENGTH_SHORT);
                    //toast.show();
                    //startActivity(new Intent(this, Menu.class));
                    if (BdD.registro(us1, BdD)) {
                        Toast toast0 = Toast.makeText(getApplicationContext(), "Ingresado con Exito", Toast.LENGTH_SHORT);
                        toast0.show();
                        startActivity(new Intent(this, Menu.class));
                        break;
                    } else {
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Usuario o Contrase??a son incorrectos", Toast.LENGTH_SHORT);
                        toast1.show();
                    }
                    break;


                case R.id.button_registro:
                    startActivity(new Intent(this, Registro.class));
                    break;

            }
        }

        @Override
        public void onPause() {
            super.onPause();
            serializacion.serializar(getApplicationContext());
        }
    }




