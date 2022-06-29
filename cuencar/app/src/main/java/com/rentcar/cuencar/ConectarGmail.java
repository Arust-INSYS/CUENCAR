package com.rentcar.cuencar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class ConectarGmail extends AppCompatActivity {
    ImageButton mibotoncuenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conectar_gmail);
        mibotoncuenta=findViewById(R.id.btnCuentaGoogle);
        iniciacontrol();
    }

    private void iniciacontrol() {
        mibotoncuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AceptarTerminos.class);
                startActivity(intent);
            }
        });
    }
}