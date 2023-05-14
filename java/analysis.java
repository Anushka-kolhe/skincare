package com.example.dermocare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class analysis extends AppCompatActivity {
    Button Cream;
    Button Serum;
    Button Aloevera;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        Cream = (Button) findViewById(R.id.button);
        Serum = (Button) findViewById(R.id.button2);
        Aloevera = (Button) findViewById(R.id.button3);
        Cream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), analysis2.class);
                startActivity(i);
                finish();

            }
        });
    }
}