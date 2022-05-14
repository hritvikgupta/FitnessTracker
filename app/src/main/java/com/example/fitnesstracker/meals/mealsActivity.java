package com.example.fitnesstracker.meals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fitnesstracker.R;

public class mealsActivity extends AppCompatActivity {

    String [] opt = {"BreakFask", "Lunch", "Dinner", "Snacks"};
    Spinner spinMeals;
    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);

        spinMeals = findViewById(R.id.spinMeals);
        test = findViewById(R.id.test);

        /*
        http://www.ahotbrew.com/android-dropdown-spinner-example/
        ### Two way of adding the Spinner First is this and the second one that we have implemented
        //ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.optMeals, android.R.layout.simple_spinner_item);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinMeals.setAdapter(adapter);


         */

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, opt);

        spinMeals.setAdapter(adapter);

         spinMeals.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                String name = (String) parent.getItemAtPosition(position);
                //Toast.makeText(mealsActivity.this, "Clicked" + name, Toast.LENGTH_SHORT).show();
                test.setText(name);


            }

             @Override
             public void onNothingSelected(AdapterView<?> adapterView) {

             }

         });


    }
}