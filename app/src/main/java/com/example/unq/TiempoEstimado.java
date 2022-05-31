package com.example.unq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TiempoEstimado extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiempo_estimado);

        Button cancelar_turno = findViewById(R.id.cancelar_turno);
        cancelar_turno.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cancelar_turno:
                Toast toast1 = Toast.makeText(getApplicationContext(), "Esto debe cancelar turno", Toast.LENGTH_SHORT);
                toast1.show();
                break;
        }
    }
}