package com.rentcar.cuencar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mis__reservas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_reservas);
        asignacion_pantalla_pendientes();
        asignacion_pantalla_reservar();
    }
    private void asignacion_pantalla_pendientes(){
        Button pen;
        pen=findViewById(R.id.btnpendiente);
        pen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent(getApplicationContext(),reservas_pendientes.class);
                startActivity(inten);
            }
        });
    }
    private void asignacion_pantalla_reservar(){
        Button res;
        res=findViewById(R.id.btnagregar);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent(getApplicationContext(),reservas_pendientes.class);
                startActivity(inten);
            }
        });
    }
}