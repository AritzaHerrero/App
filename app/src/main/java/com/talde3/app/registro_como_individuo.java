package com.talde3.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registro_como_individuo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_como_individuo);

        Button btnDejarRegistroComoIndividuo = findViewById(R.id.btnDejarRegistroComoIndividuo);

        btnDejarRegistroComoIndividuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_individuo.this, comoRegistrarte.class);
                startActivity(intent);
            }
        });
    }
}