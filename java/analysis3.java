package com.example.dermocare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class analysis3 extends AppCompatActivity {
    Button OILY;
    Button DRY;
    Button Combination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis3);
        OILY = (Button) findViewById(R.id.button);
        DRY = (Button) findViewById(R.id.button2);
        Combination = (Button) findViewById(R.id.button3);
        OILY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Products.class);
                startActivity(i);
                finish();
            }
        });

    }
}