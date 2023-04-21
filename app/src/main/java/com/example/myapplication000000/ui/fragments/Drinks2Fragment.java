package com.example.myapplication000000.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.myapplication000000.R;
import com.example.myapplication000000.databinding.Screen3Binding;

public class Drinks2Fragment extends Fragment {
    Screen3Binding binding;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            String name = getArguments().getString("Name");
            String drink1 = getArguments().getString("Drink");
            int image = getArguments().getInt("Image");
            binding.textView.setText(name);
            binding.textView2.setText(drink1);
            binding.imageView.setImageResource(image);
        }
        binding.ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Bundle bundle = new Bundle();
                bundle.putFloat("Rating",binding.ratingBar.getRating());
                Navigation.findNavController(view)
                        .navigate(R.id.action_single_drinks2_fragment_to_drinks2_list_fragment,bundle);
            }
        });

    }
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = Screen3Binding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
