package com.example.dermocare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class analysis2 extends AppCompatActivity {
    Button PCOD ;
    Button PCOS;
    Button Regular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis2);
        PCOD = (Button) findViewById(R.id.button);
        PCOS = (Button) findViewById(R.id.button2);
        Regular = (Button) findViewById(R.id.button3);
        PCOD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), analysis3.class);
                startActivity(i);
                finish();
            }
        });

    }
}