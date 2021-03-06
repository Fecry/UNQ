package com.example.unq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java_clases.Estructuras.DynamicArray;
import java_clases.main.Serializacion;
import java_clases.main.Usuario;
import java_clases.main.Text;

public class Registro extends AppCompatActivity implements View.OnClickListener {
    public static DynamicArray<Usuario> BdD = MainActivity.BdD;
    public static Serializacion serializacion = MainActivity.serializacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button registrarse2 = findViewById(R.id.button_registro2);
        registrarse2.setOnClickListener(this);
        serializacion.deserializar(getApplicationContext());
    }

    public void onStart(){
        super.onStart();
        serializacion.deserializar(getApplicationContext());
    }
    public void onPause() {
        super.onPause();
        serializacion.serializar(getApplicationContext());
    }

    public void onStop(){
        super.onStop();
        serializacion.serializar(getApplicationContext());
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_registro2:
                String doc="";
                String ctr="";
                String ctrC="";
                EditText documento = findViewById(R.id.identificacion_registro);
                EditText contrasena = findViewById(R.id.contrasena_registro);
                EditText conf_contrasena = findViewById(R.id.confirmar_contrasena_registro);

                doc = documento.getText().toString();
                ctr = contrasena.getText().toString();
                ctrC = conf_contrasena.getText().toString();



                if (ctr.equals(ctrC)){
                    Usuario temp = new Usuario(doc, ctr);

                    if(BdD.isOriginal(temp, BdD)==true){
                        BdD.pushBack(temp);
                        Usuario us1= temp;
                        Toast toast0 = Toast.makeText(getApplicationContext(), "Usuario Creado", Toast.LENGTH_SHORT);
                        toast0.show();
                        finish();

                    }

                    else{
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Usuario ya Existe", Toast.LENGTH_SHORT);
                        toast1.show();
                    }
                }

                else {
                    Toast toast2 = Toast.makeText(getApplicationContext(), "Las contrase??as no coinciden", Toast.LENGTH_SHORT);
                    toast2.show();
                }
                break;

        }
    }
}