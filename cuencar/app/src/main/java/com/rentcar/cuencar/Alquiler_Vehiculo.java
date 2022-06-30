package com.rentcar.cuencar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Alquiler_Vehiculo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alquiler_vehiculo);
        Informacion_Alquiler();
    }

    private void IniciaControl(){
        Button btnBusqueda;
        btnBusqueda=findViewById(R.id.btnBuscar);
        btnBusqueda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(inten);
            }
        });

    }
    private void Informacion_Alquiler(){
        Button botonBuscar;
        botonBuscar=findViewById(R.id.btnBuscar);
        botonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getApplicationContext(),Informacion.class);
                startActivity(intent3);
            }
        });
    }
}