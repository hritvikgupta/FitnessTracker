package com.example.fitnesstracker.meals;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fitnesstracker.R;


public class mealRecyclerFragment1 extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter myadpater;
    RecyclerView.LayoutManager layoutManager;




    public mealRecyclerFragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_meal_recycler1, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.mealRecycler1);

        layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerView.setLayoutManager(layoutManager);

        myadpater = new saveMealsRecyclerViewAdapter(savedMealsApplicationClass.saveMeals);
        recyclerView.setAdapter(myadpater);






    }

    public void notifyChanged()
    {
        myadpater.notifyDataSetChanged();
    }
}