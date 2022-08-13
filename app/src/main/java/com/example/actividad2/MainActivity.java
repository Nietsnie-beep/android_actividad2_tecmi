package com.example.actividad2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mensaje;
    EditText editarText;


    public void buttonPressed(View view){
       //mensaje = findViewById(R.id.textView4);
        editarText = findViewById(R.id.editTextTextPersonName);

        mensaje.setText(editarText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensaje = findViewById(R.id.textView4);
        mensaje.setText("Hola Nietsnie");
    }
}