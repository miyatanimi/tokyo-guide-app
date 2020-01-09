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

public class DescriptionAdapter extends ArrayAdapter<Description> {

    public DescriptionAdapter(@NonNull Context context, @NonNull List objects) {
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
        Description currentDescription = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name);
        nameTextView.setText(currentDescription.getName());

        TextView descriptionTextView = listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentDescription.getDescription());

        return listItemView;
    }
}
