package com.talde3.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class comoRegistrarte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_registrarte);

        Button comoEmpresa = findViewById(R.id.btnComoEmpresa);
        comoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginORegistro.this, primeraPantalla.class);
                startActivity(intent);
            }
        });

        Button comoI = findViewById(R.id.btnComoEmpresa);
        comoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginORegistro.this, primeraPantalla.class);
                startActivity(intent);
            }
        });

        Button comoEmpresa = findViewById(R.id.btnComoEmpresa);
        comoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginORegistro.this, primeraPantalla.class);
                startActivity(intent);
            }
        });

    }

}