package com.rentcar.cuencar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asignacion();
        asignacion_pantalla_historial();
    }

    private void asignacion(){
            Button edi;
        edi=findViewById(R.id.btn_editar);
        edi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent(getApplicationContext(),pantalla_editar.class);
                startActivity(inten);
            }
        });
    }
    private void asignacion_pantalla_historial(){
        Button his;
        his=findViewById(R.id.btnmihistoria);
        his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent(getApplicationContext(),HIstorial_alquiler.class);
                startActivity(inten);
            }
        });
    }
}