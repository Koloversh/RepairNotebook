package com.example.repairnotebook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WorksActivity extends AppCompatActivity{

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.works_activity);

        RecyclerView recyclerView = findViewById(R.id.listOfButtons);
        WorksAdapter adapter = new WorksAdapter();
        List<String> items = new ArrayList<>();
        items.add(getResources().getString(R.string.Engine));
        items.add(getResources().getString(R.string.Fuel));
        items.add(getResources().getString(R.string.transmission));
        items.add(getResources().getString(R.string.FrontAxle));
        items.add(getResources().getString(R.string.Wheels));
        items.add(getResources().getString(R.string.Controls));
        items.add(getResources().getString(R.string.TheBody));
        items.add(getResources().getString(R.string.Elecrics));
        items.add(getResources().getString(R.string.RearAxle));
        items.add(getResources().getString(R.string.Another));
        items.add(getResources().getString(R.string.Service));

        adapter.setData(items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

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
