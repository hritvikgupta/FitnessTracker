package com.example.fitnesstracker.meals;

import android.app.Application;

public class savedMeals {

    private String BreakFast, Lunch, Dinner, Snacks;

    public savedMeals(String breakFast, String lunch, String dinner, String snacks) {
        BreakFast = breakFast;
        Lunch = lunch;
        Dinner = dinner;
        Snacks = snacks;
    }

    public String getBreakFast() {
        return BreakFast;
    }

    public void setBreakFast(String breakFast) {
        BreakFast = breakFast;
    }

    public String getLunch() {
        return Lunch;
    }

    public void setLunch(String lunch) {
        Lunch = lunch;
    }

    public String getDinner() {
        return Dinner;
    }

    public void setDinner(String dinner) {
        Dinner = dinner;
    }

    public String getSnacks() {
        return Snacks;
    }

    public void setSnacks(String snacks) {
        Snacks = snacks;
    }
}
