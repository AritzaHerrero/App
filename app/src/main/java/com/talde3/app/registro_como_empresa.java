package com.talde3.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class registro_como_empresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_como_empresa);

        Button btnRetroceder = findViewById(R.id.btnRegistroEmpresaRetroceder);

        btnRetroceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_empresa.this, comoRegistrarte.class);
                startActivity(intent);
            }
        });
        Button btnRegistrar = findViewById(R.id.btnRegistroEmpresaRegistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_empresa.this, primeraPantalla.class);
                startActivity(intent);
            }
        });

        TextView txtTerminos = findViewById(R.id.txtRegistroEmpresaTerminos);
        txtTerminos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_empresa.this, terminos_y_condiciones.class);
                intent.putExtra("actividad_actual", "registro_como_empresa");
                startActivity(intent);
            }
        });

    }
}
