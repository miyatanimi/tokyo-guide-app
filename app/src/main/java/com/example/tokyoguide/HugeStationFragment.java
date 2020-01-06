package com.example.tokyoguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

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
        View root = inflater.inflate(R.layout.disc_list, container, false);

        ArrayList<Discription> discriptions = new ArrayList<>();
        discriptions.add(new Discription("Ikebukuro Station","Town for Otaku girls"));
        discriptions.add(new Discription("Shinjuku Station","Can you imagine 3 million people pass here everyday!!"));

        DiscriptionAdapter adapter = new DiscriptionAdapter(getContext(),discriptions);
        ListView listView = (ListView) root.findViewById(R.id.list);
        listView.setAdapter(adapter);

//        TextView tx = (TextView) root.findViewById(R.id.text_huge_cities);
//        tx.setText("Hello from Huge Stations");
        return root;
    }
}
