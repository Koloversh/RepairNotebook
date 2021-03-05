package com.example.repairnotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userCarEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonToWorks(View view) {

        Intent worksIntent = new Intent(MainActivity.this, works.class);
        startActivity(worksIntent);
    }

    public void ButtonOfDataOfCar(View view) {
    }

    public void ButtonOfSearchByDate(View view) {
    }

    public void ButtonOfSearchBySubject(View view) {
    }
}