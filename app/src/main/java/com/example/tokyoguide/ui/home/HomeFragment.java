package com.example.tokyoguide.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.tokyoguide.HugeStationFragment;
import com.example.tokyoguide.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        final TextView overview = root.findViewById(R.id.overview);
        overview.setText("Hello! This app will introduce spots in Tokyo with my prejudice and personal opinions.\n" +
                "This has 3 sections. The first part is large stations in Tokyo, the second is great parks in Tokyo, and the last one is things to do in Tokyo.\n" +
                "Every section doesn't have so useful info for tourists, but I think you don't know that local info. Enjoy!");
        final TextView question = root.findViewById(R.id.question);
        question.setText("If you have questions, don't hesitate to reach me!\n" +
                "Twitter @dev_mitani");
        return root;
    }
}