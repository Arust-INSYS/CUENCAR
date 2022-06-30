package com.rentcar.cuencar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class confirmacion_datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion_datos);
        IniciaControl();
    }

    private void IniciaControl(){
        Button btn_boton2;
        btn_boton2=findViewById(R.id.button2);
        btn_boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(getApplicationContext(), transaccion.class);
                startActivity(inten);
            }
        });

    }
}