package com.talde3.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class registro_como_individuo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_como_individuo);

        TextView termsAndConditionsLink = findViewById(R.id.txtTerminosYCondiciones);
        termsAndConditionsLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_individuo.this, Terminos_y_condiciones.class);
                startActivity(intent);
            }
        });

        Button btnRetroceder = findViewById(R.id.btnRegistroIndividuoRetroceder);
        Button btnRegistrar = findViewById(R.id.btnRegistroIndividuoRegistrar);
        btnRetroceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_individuo.this, comoRegistrarte.class);
                startActivity(intent);
            }
        });
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_individuo.this, primeraPantalla.class);
                startActivity(intent);
            }
            //POR IMPLEMENTAR - Bloqueo de boton frente a parametros vacios o insufucientes/guardado en la base de datos de ususarios nuevos/verfificación de usuario existente
        });
    }
}
