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
        Button comoIndividuo = findViewById(R.id.btnComoIndividuo);
        Button btnDejarComoRegistrarte = findViewById(R.id.btnDejarComoRegistrarte);
        comoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(comoRegistrarte.this, registro_como_empresa.class);
                startActivity(intent);
            }
        });
        comoIndividuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(comoRegistrarte.this, registro_como_individuo.class);
                startActivity(intent);
            }
        });
        btnDejarComoRegistrarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(comoRegistrarte.this, loginORegistro.class);
                startActivity(intent);
            }
        });

    }

}