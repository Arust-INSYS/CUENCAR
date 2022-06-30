package com.rentcar.cuencar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {
    Button mibotonConfirmar;
    Button mibotonCancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        mibotonConfirmar=findViewById(R.id.btnConfirmar);
        mibotonCancelar=findViewById(R.id.btnCancelar);
        iniciaControl();
    }

    private void iniciaControl() {
        mibotonConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AceptarTerminos.class);
                startActivity(intent);
            }
        });
        mibotonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(v.getContext());
                builder.setTitle("Mensaje");
                builder.setMessage("Estas seguro de cancelar?");
                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(),Login.class);
                        startActivity(intent);
                    }
                });
                builder.setNegativeButton(android.R.string.cancel, null);
                Dialog dialog = builder.create();
                dialog.show();
            }
        });
    }

}