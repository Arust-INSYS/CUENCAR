package com.rentcar.cuencar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asignacion_Apantall_perfil();
        asignacion_Apantall_reserva();
    }
    private void asignacion_Apantall_perfil() {
        Button per;
        per = findViewById(R.id.btnPerfil);
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(inten);
            }
        });
    }
    private void asignacion_Apantall_reserva() {
        Button per;
        per = findViewById(R.id.btnMisReservas);
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(getApplicationContext(), mis__reservas.class);
                startActivity(inten);
            }
        });
    }//brrooooooooooooooooooooooooooooooooooo
}