package com.talde3.app;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;


public class registro_como_individuo extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_como_individuo);

        Button btnRetroceder = findViewById(R.id.btnRegistroIndividualRetroceder);

        btnRetroceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(registro_como_individuo.this, comoRegistrarte.class);
                startActivity(intent);
            }
        });

        Button btnRegistrar = findViewById(R.id.btnRegistroIndividualRegistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence text = "Hay que rellenar todos los campos";
                CharSequence text2 = "La contraseña es incorrecta";
                int duration = Toast.LENGTH_SHORT;

                Toast error_message = Toast.makeText(registro_como_individuo.this, text, duration);
                Toast error_message_contra = Toast.makeText(registro_como_individuo.this, text2, duration);

                EditText nombre = findViewById(R.id.edtRegistroIndividualNombre);
                EditText dni = findViewById(R.id.edtRegistroIndividualDni);
                EditText telf = findViewById(R.id.edtRegistroIndividualTelefono);
                EditText mail = findViewById(R.id.edtRegistroIndividualEmail);
                EditText pais = findViewById(R.id.edtRegistroIndividualPais);
                EditText dir = findViewById(R.id.edtRegistroIndividualDireccion);
                EditText contra = findViewById(R.id.edtRegistroIndividualContraseña);
                EditText contra2 = findViewById(R.id.edtRegistroIndividualRepetirContraseña);

                if(!nombre.getText().toString().isEmpty() & !dni.getText().toString().isEmpty() & !telf.getText().toString().isEmpty() & !mail.getText().toString().isEmpty() & !pais.getText().toString().isEmpty() & !dir.getText().toString().isEmpty() & !contra.getText().toString().isEmpty() & !contra2.getText().toString().isEmpty())
                {
                    if(contra.getText().toString().equals(contra2.getText().toString()))
                    {
                        Log.w(TAG, "BIEN");
                        Pertsona pertsona = new Pertsona(nombre.getText().toString());
                        db.collection("Erabiltzaileak").document(dni.getText().toString()).set(pertsona);
                        Intent intent = new Intent(registro_como_individuo.this, primeraPantalla.class);
                        startActivity(intent);
                    }else{
                        error_message_contra.show();
                        Log.e(TAG, "ERROR");
                    }
                }else{
                    error_message.show();
                    Log.e(TAG, "ERROR");
                }


            }
        });
    }
}
