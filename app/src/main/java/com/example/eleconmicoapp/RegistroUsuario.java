package com.example.eleconmicoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroUsuario extends AppCompatActivity {
Button btnLogin,btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        btnLogin = findViewById(R.id.btnLogin);
        btnRegistrar = findViewById(R.id.btnRegistrar);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistroUsuario.this, Login.class);
                startActivity(intent);
            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(RegistroUsuario.this);
                builder.setTitle("Confirmación");
                builder.setMessage("Ingresa el código de confirmación enviado a su correo:");

                // Agregar un EditText para que el usuario ingrese el código
                final EditText input = new EditText(RegistroUsuario.this);
                input.setInputType(InputType.TYPE_CLASS_NUMBER);
                builder.setView(input);

                // Agregar los botones "Aceptar" y "Cancelar"
                builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String code = input.getText().toString();
                        // Agregar código para verificar el código de confirmación aquí
                    }
                });
                builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                // Mostrar la ventana de confirmación
                builder.show();

                String code = input.getText().toString();
                if (code.equals("1234")) {
                    // El código es correcto, hacer algo aquí
                } else {
                    // El código es incorrecto, mostrar un mensaje de error o hacer algo aquí
                }

            }

        });
    }
}