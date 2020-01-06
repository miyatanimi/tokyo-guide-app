package com.example.tokyoguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class DiscriptionAdapter extends ArrayAdapter<Discription> {

    public DiscriptionAdapter(@NonNull Context context, @NonNull List objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Discription currentDiscription = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name);
        nameTextView.setText(currentDiscription.getName());

        TextView descriptionTextView = listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentDiscription.getDescription());

        return listItemView;
    }
}
