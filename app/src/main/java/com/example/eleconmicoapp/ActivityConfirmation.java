package com.example.eleconmicoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

public class ActivityConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        // Obtiene los elementos de la interfaz de usuario
        TextView messageTextView = findViewById(R.id.message_textview);
        EditText confirmationCodeEditText = findViewById(R.id.confirmation_code_edittext);

        // Establece el mensaje de texto en el TextView
        messageTextView.setText("Ingrese el código de confirmación enviado a su correo");
    }
}
