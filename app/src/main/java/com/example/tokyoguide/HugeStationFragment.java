package com.example.tokyoguide;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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

        ArrayList<Description> descriptions = new ArrayList<>();
        descriptions.add(new Description(
                "Ikebukuro Station",
                "You might think Akihabara is an only Otaku and anime culture area, but it's wrong! Ikebukuro is also suitable for someone who loves anime; especially you like seeing handsome guys in anime. There are holding a lot of \"collaboration cafe\" which means you can get drinks and food that related anime characters.\n" +
                "(This is personal view though!!)",
                R.drawable.ikebukuro
        ));
        descriptions.add(new Description(
                "Shinjuku Station",
                "Can you imagine over 3.5 million people pass through here every day? Shinjuku has the largest number of passengers in the world. Avoiding the crowd is impossible here, so you need to learn to slip through between people. Also, here is known for having Kabuki-cho: a great place to drink all night.",
                R.drawable.shinjuku
        ));
        descriptions.add(new Description(
                "Shibuya Station",
                "I guess there is no crossing streets is taken the more many photos than Shibuya crossing street in the world. Everyone takes pictures, and if I was not Japanese, also I took pictures. One day, I saw people took a group photo in the middle of the crossing street. Oh, my goodness... I love Parco in Shibuya but other things are a bit chaotic and awful.",
                R.drawable.shibuya
        ));

        DescriptionAdapter adapter = new DescriptionAdapter(getContext(), descriptions);
        ListView listView = (ListView) root.findViewById(R.id.list);
        listView.setAdapter(adapter);

//        TextView tx = (TextView) root.findViewById(R.id.text_huge_cities);
//        tx.setText("Hello from Huge Stations");
        return root;
    }
}
