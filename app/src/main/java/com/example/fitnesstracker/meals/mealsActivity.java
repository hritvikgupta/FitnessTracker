package com.example.fitnesstracker.meals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fitnesstracker.R;

import java.util.ArrayList;

public class mealsActivity extends AppCompatActivity implements saveMealsRecyclerViewAdapter.onSpinClicked{

    String [] opt = {"BreakFast", "Lunch", "Dinner", "Snacks"};
    Spinner spinMeals;
    TextView mealText;
    Button mealBtn;
    int Pos;
    FragmentManager fragmentManager;
    mealRecyclerFragment1 mfrag;

    ArrayList<savedMeals> sMeals;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);


        mealBtn = findViewById(R.id.mealBtn);
        spinMeals = findViewById(R.id.spinMeals);
        mealText = findViewById(R.id.mealText);
        fragmentManager = mealsActivity.this.getSupportFragmentManager();
        mfrag = (mealRecyclerFragment1) fragmentManager.findFragmentById(R.id.mealFragment1);

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
                name = (String) parent.getItemAtPosition(position);
                Pos = position;
                //Toast.makeText(mealsActivity.this, "Clicked" + name, Toast.LENGTH_SHORT).show();



            }

             @Override
             public void onNothingSelected(AdapterView<?> adapterView) {

             }

         });

         mealBtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String item = mealText.getText().toString().trim();
                 savedMeals m1;
                 if(name.equals("BreakFast")) {
                     m1 = new savedMeals(item, "", "", "");
                     savedMealsApplicationClass.saveMeals.add(m1);
                     mfrag.notifyChanged();
                 }
                 else if(name.equals("Lunch")){
                     m1 = new savedMeals("", item, "", "");

                 }


             }
         });


    }


    @Override
    public void spinClicked(int index) {

    }
}