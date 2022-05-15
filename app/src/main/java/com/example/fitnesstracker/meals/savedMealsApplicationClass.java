package com.example.fitnesstracker.meals;

import android.app.Application;

import java.util.ArrayList;

public class savedMealsApplicationClass extends Application {

    public static ArrayList<savedMeals> saveMeals = new ArrayList<savedMeals>();

    @Override
    public void onCreate() {
        super.onCreate();

        savedMeals m1 = new savedMeals("BreakFast", "lunch","Dinner", "snacks");
        saveMeals.add(m1);
    }
}
