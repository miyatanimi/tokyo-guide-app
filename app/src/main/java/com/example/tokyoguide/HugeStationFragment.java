package com.example.tokyoguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HugeStationFragment extends Fragment {


    public HugeStationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_huge_stations, container, false);
        TextView tx = (TextView) root.findViewById(R.id.text_huge_cities);
        tx.setText("Hello from Huge Stations");
        return root;
    }
}
