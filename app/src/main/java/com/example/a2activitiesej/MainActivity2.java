package com.example.a2activitiesej;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button finalizar;
    WebView pagina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        finalizar= findViewById(R.id.finalizar);
        pagina= findViewById(R.id.pagina);
        Bundle bundle=getIntent().getExtras();
        String paginas=bundle.getString("url");
        pagina.loadUrl("https://"+paginas);

    }
    public void finalizar(View view){
        finish();
    }
}