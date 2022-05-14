package com.example.fitnesstracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class optionAdapter extends ArrayAdapter<String> {

    ArrayList<String> arr;
    Context context;

    ImageView drawLogo;
    private int [] logos = {R.drawable.meal3, R.drawable.workout, R.drawable.foot3, R.drawable.water, R.drawable.feedback};




    public optionAdapter(@NonNull Context context, int resource, ArrayList<String> arr) {
        super(context, resource, arr);
        this.context = context;
        this.arr = arr;

    }

    @Nullable
    @Override
    public String getItem(int position) {

        return arr.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
         convertView = LayoutInflater.from(getContext()).inflate(R.layout.option_adapter, parent, false);
         TextView t = convertView.findViewById(R.id.optionsText);
         t.setText(getItem(position));

         drawLogo = (ImageView) convertView.findViewById(R.id.optionsImage);
         drawLogo.setImageResource(logos[position]);

         return convertView;

    }
}
