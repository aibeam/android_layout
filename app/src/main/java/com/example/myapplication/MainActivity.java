package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);
        btnConfirm = findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LinearActivity.class);
                startActivity(intent);
            }
        });

        //람다식으로 변환하면
        /*btnConfirm.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Welcome!", Toast.LENGTH_SHORT).show();
        });*/
    }
}