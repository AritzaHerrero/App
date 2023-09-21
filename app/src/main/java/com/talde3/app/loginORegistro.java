package com.talde3.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginORegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_o_registro);


        Button loginButton = findViewById(R.id.btnLoginLogin);
        TextView txtRegistrarseLogin = findViewById(R.id.txtRegistrarseLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginORegistro.this, primeraPantalla.class);
                startActivity(intent);
            }
        });

        txtRegistrarseLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(loginORegistro.this, comoRegistrarte.class);
                startActivity(intent);
            }
        });
    }
}