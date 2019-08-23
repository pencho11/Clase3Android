package com.example.ejemplotoasyaperturaactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ejecutarToat(View view){
        Toast notificacion = Toast.makeText(this, "Ejecutando TOAST", Toast.LENGTH_LONG);
        notificacion.show();
    }

    public void abrirAcercaDe(View view){
        Intent ventana = new Intent(this, AcercaDe.class);
        startActivity(ventana);
    }
}
