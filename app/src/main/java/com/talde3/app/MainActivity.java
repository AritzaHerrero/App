package com.talde3.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, loginORegistro.class); // Sortu intent bat loginORegistratu hasteko
                startActivity(intent);
                finish(); // Honek MainActivity ixten du, erabiltzaileak Atzera botoia erabiliz bertara itzultzea nahi ez baduzu.
            }
        }, 1000); // zenbat denbora tardatzen duen aldatzen 1sg=1000
    }
}