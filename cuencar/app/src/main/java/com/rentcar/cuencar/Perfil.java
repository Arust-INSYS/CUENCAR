package com.rentcar.cuencar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Perfil extends AppCompatActivity {
    Button pr;
    Button per;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        per = (Button) findViewById(R.id.btn_editar2);
        pr = (Button) findViewById(R.id.btnmihistoria2);
         asignacion_Apantall_editar();
    }

    private void asignacion_Apantall_editar() {

        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(getApplicationContext(),editar_perfil.class);
                startActivity(inten);
            }
        });
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(getApplicationContext(),alquiler.class);
                startActivity(inten);
            }
        });

    }
}

