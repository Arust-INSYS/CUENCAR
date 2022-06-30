package com.rentcar.cuencar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class catalogo extends AppCompatActivity {
    Button btn_auto1;
    Button btn_auto2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        //comenta
        btn_auto1=findViewById(R.id.boton_auto1);
        btn_auto2=findViewById(R.id.boton_auto2);

        iniciaControl();
    }

    private void iniciaControl(){
        btn_auto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Informacion_auto.class);
                startActivity(intent);
            }
        });

    }

}