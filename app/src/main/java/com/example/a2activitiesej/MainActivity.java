package com.example.a2activitiesej;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText main_escribir;
    Button main_buscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_escribir= findViewById(R.id.main_escribir);
        main_buscar= findViewById(R.id.main_buscar);
    }
    public void buscar(View view){
        Intent intent= new Intent(this, MainActivity2.class);
        intent.putExtra("url", main_escribir.getText().toString());
        startActivity(intent);
        
        
    }
}