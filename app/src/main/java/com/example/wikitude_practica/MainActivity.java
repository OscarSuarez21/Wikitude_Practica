 package com.example.wikitude_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

    Button camara, info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        camara =(Button)findViewById(R.id.Camara);
        info =(Button)findViewById(R.id.info);

        camara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camara = new Intent(MainActivity.this, CamaraVirtual.class);
                startActivity(camara);

            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent info = new Intent(MainActivity.this, info.class);
                startActivity(info);

            }
        });
    }
}