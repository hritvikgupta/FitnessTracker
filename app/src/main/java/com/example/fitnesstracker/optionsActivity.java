package com.example.fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class optionsActivity extends AppCompatActivity {

    ListView list;
    ArrayList<String> options;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        list = findViewById(R.id.list);
        options = new ArrayList<String>();
        options.add("Meals");
        options.add("Workouts");
        options.add("Foot Steps");
        options.add("Water Intake");
        options.add("Feedback");


        optionAdapter ad = new optionAdapter(this, R.layout.option_adapter, options);
        list.setAdapter(ad);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(optionsActivity.this, "Clicked on" + " " + adapterView.getItemAtPosition(i), Toast.LENGTH_SHORT).show();
                if(adapterView.getItemAtPosition(i).equals("Meals"))
                {
                    Intent intent = new Intent(optionsActivity.this, com.example.fitnesstracker.meals.mealsActivity.class);
                    startActivity(intent);
                }
            }

        });
    }
}