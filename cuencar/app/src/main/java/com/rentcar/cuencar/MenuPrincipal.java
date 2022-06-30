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
        setContentView(R.layout.activity_menuprinc);
        //IniciaMenu();
        asignacion_Apantall_perfil();
        asignacion_Apantall_reserva();
        //Alquiler
        IngresarAlquiler();
        IngresarContactos();

    }



    //METODO PARA ENTRAR A MI PERFIL
    private void asignacion_Apantall_perfil() {
        Button per;
        per = findViewById(R.id.btnPerfil);
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(getApplicationContext(),Perfil.class);
                startActivity(inten);
            }
        });
    }

    //METODO PARA ENTRAR A MIS RESERVAS
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
    }

    //METODO PARA ENTRAR A ALQUILER DE VEHICULOS
    private void IngresarAlquiler(){
        Button btnPerfil;
        btnPerfil=findViewById(R.id.btnAlquilar);
        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(getApplicationContext(),Alquiler_Vehiculo.class);
                startActivity(intent3);
            }
        });
    }


    private void IngresarContactos(){
        Button btnContactos;
        btnContactos=findViewById(R.id.btnContactos);
        btnContactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(getApplicationContext(),Informacion.class);
                startActivity(intent4);
            }
        });
    }
}