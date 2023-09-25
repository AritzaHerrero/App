package com.talde3.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registro_como_empresa_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_como_empresa3);
        Button btnRetroceder = findViewById(R.id.btnRegistroEmpresaRetroceder);
        Button btnRegistrar = findViewById(R.id.btnRegistroEmpresaRegistrar);

        btnRetroceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_empresa_3.this, registro_como_empresa_2.class);
                startActivity(intent);
            }
        });
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_empresa_3.this, primeraPantalla.class);
                startActivity(intent);
            }
            //POR IMPLEMENTAR - Bloqueo de boton frente a parametros vacios o insufucientes/guardado en la base de datos de ususarios nuevos/verfificación de usuario existente
        });
    }
}