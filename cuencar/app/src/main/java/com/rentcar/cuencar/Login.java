package com.rentcar.cuencar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {
    Button mibotoningresar;
    Button mibotonregistrar;
    ImageButton mibotonConectarGmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //
        mibotoningresar=findViewById(R.id.btnIngresar);
        mibotonregistrar=findViewById(R.id.btnRegistrar);
        mibotonConectarGmail=findViewById(R.id.btnGoogle);
        iniciaControl();
    }

    private void iniciaControl(){
        mibotoningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MenuPrincipal.class);
                startActivity(intent);
            }
        });
        mibotonregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Registro.class);
                startActivity(intent);
            }
        });
        mibotonConectarGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ConectarGmail.class);
                startActivity(intent);
            }
        });
    }
}