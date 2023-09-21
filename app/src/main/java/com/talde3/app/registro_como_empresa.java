package com.talde3.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registro_como_empresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_como_empresa);
        Button btnDejarRegistroComoEmpresa = findViewById(R.id.btnDejarRegistroComoEmpresa);

        btnDejarRegistroComoEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_empresa.this, comoRegistrarte.class);
                startActivity(intent);
            }
        });
    }
}