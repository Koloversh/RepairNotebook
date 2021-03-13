package com.example.repairnotebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WorksActivity extends AppCompatActivity{

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.works_activity);

        button = findViewById(R.id.engineButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent worksIntent = new Intent(WorksActivity.this, WorksDataActivity.class);
                startActivity(worksIntent);
            }
        });

        button = findViewById(R.id.fuelButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent worksIntent = new Intent(WorksActivity.this, WorksDataActivity.class);
                startActivity(worksIntent);
            }
        });

        button = findViewById(R.id.transmissionButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent worksIntent = new Intent(WorksActivity.this, WorksDataActivity.class);
                startActivity(worksIntent);
            }
        });

        button = findViewById(R.id.frontbridgeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent worksIntent = new Intent(WorksActivity.this, WorksDataActivity.class);
                startActivity(worksIntent);
            }
        });

        button = findViewById(R.id.controlsButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent worksIntent = new Intent(WorksActivity.this, WorksDataActivity.class);
                startActivity(worksIntent);
            }
        });

        button = findViewById(R.id.shellButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent worksIntent = new Intent(WorksActivity.this, WorksDataActivity.class);
                startActivity(worksIntent);
            }
        });

        button = findViewById(R.id.wiresButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent worksIntent = new Intent(WorksActivity.this, WorksDataActivity.class);
                startActivity(worksIntent);
            }
        });

        button = findViewById(R.id.backbridgeButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent worksIntent = new Intent(WorksActivity.this, WorksDataActivity.class);
                startActivity(worksIntent);
            }
        });

        button = findViewById(R.id.anotherThingsButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent worksIntent = new Intent(WorksActivity.this, WorksDataActivity.class);
                startActivity(worksIntent);
            }
        });

        button = findViewById(R.id.serviceButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent worksIntent = new Intent(WorksActivity.this, WorksDataActivity.class);
                startActivity(worksIntent);
            }
        });

        button = findViewById(R.id.subjectSearchButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button = findViewById(R.id.dateSearchButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
