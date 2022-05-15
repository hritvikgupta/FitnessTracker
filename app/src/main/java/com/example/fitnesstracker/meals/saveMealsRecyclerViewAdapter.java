package com.example.fitnesstracker.meals;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitnesstracker.R;

import java.util.ArrayList;

public class saveMealsRecyclerViewAdapter extends RecyclerView.Adapter<saveMealsRecyclerViewAdapter.ViewHolder>{


    private ArrayList<savedMeals> saveMeals;
    public interface onSpinClicked
    {
        void spinClicked(int index);
    }

    public saveMealsRecyclerViewAdapter(ArrayList<savedMeals> savedMeals)
    {
        this.saveMeals = savedMeals;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView mealTag, mealsAdded;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mealTag = itemView.findViewById(R.id.mealTag);
            mealsAdded = itemView.findViewById(R.id.mealsAdded);

        }
    }
    @NonNull
    @Override
    public saveMealsRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull saveMealsRecyclerViewAdapter.ViewHolder holder, int position) {

        holder.mealTag.setText(saveMeals.get(position).getBreakFast());

    }

    @Override
    public int getItemCount() {
        return saveMeals.size();
    }
}


