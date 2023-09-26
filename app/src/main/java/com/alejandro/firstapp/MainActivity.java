package com.alejandro.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaracion de variables globales
    TextView holamundo;
    Button btnExplicito;
    Button btnImplicito;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("holamundo","onCreate");
        //Inicializacion de variables y enlace a componente
        holamundo = findViewById(R.id.txtHolaMundo);
        btnExplicito = findViewById(R.id.btnExplicito);
        btnImplicito = findViewById(R.id.btnImplicito);

        //Evento click
        btnExplicito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent explicito
                Intent i = new Intent(MainActivity.this, Activity2.class);
                startActivity(i);
                //Se utiliza para destruir la actividad en contexto
                //finish();
            }
        });

        btnImplicito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent explicito
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=messi&sca_esv=568381026&rlz=1C1CHBF_esMX1063MX1063&tbm=isch&sxsrf=AM9HkKmhjN73RByXcjdSZ9JowrD2YRZdfQ:1695699145994&source=lnms&sa=X&ved=2ahUKEwjMofjJq8eBAxV1N0QIHWlRDmUQ_AUoAXoECAQQAw&biw=1536&bih=747&dpr=1.25#imgrc=u_HmLS2F2bOo6M"));
                startActivity(i);
                //Se utiliza para destruir la actividad en contexto
                //finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("holamundo","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("holamundo","onResume");
        holamundo.setText("Hola mundo desde la clase Java en el metodo OnResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("holamundo","onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("holamundo","onDestroy");
    }
}