package com.example.repairnotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userCarEditText;

    Button bttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttn = findViewById(R.id.worksButton);
        //ссылка на кнопку
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent worksIntent = new Intent(MainActivity.this, WorksActivity.class);
                startActivity(worksIntent);
            }
        });

        bttn = findViewById(R.id.dataOfCarButton);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent worksIntent = new Intent(MainActivity.this, CarDataActivity.class);
                startActivity(worksIntent);
            }
        });
    }








}