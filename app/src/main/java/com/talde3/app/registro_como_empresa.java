package com.talde3.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registro_como_empresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_como_empresa);

        EditText NombreEmpresa = findViewById(R.id.etRegistroEmpresaNombre);
        EditText DireccionEmpresa = findViewById(R.id.etRegistroEmpresaDireccion);
        EditText NIFEmpresa = findViewById(R.id.etRegistroEmpresaNIF);
        EditText TelefonoEmpresa = findViewById(R.id.etRegistroEmpresaTelefono);
        EditText EmailEmpresa = findViewById(R.id.etRegistroEmpresaEmail);
        EditText ContrasenaEmpresa = findViewById(R.id.etRegistroEmpresaContrasena);

        Button btnRetroceder = findViewById(R.id.btnRegistroEmpresaRetroceder);
        Button btnRegistrar = findViewById(R.id.btnRegistroEmpresaRegistrar);

        btnRetroceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_empresa.this, comoRegistrarte.class);
                startActivity(intent);
            }
        });
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_empresa.this, primeraPantalla.class);
                startActivity(intent);
            }
            //POR IMPLEMENTAR - Bloqueo de boton frente a parametros vacios o insufucientes/guardado en la base de datos de ususarios nuevos/verfificación de usuario existente
        });
    }
}