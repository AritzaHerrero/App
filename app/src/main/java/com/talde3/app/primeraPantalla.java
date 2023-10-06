package com.talde3.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class primeraPantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_pantalla);

        ImageButton btnAbrirDesplegable = findViewById(R.id.imgBtnAbrirMenuDesplegable);
        LinearLayout linearLayout = findViewById(R.id.linearLayoutMenu);
        ImageButton btnCerrarDesplegable = findViewById(R.id.imgBtnCerrarMenuDesplegable);

        btnAbrirDesplegable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.VISIBLE);
            }
        });
        btnCerrarDesplegable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setVisibility(View.INVISIBLE);
            }
        });
    }
}