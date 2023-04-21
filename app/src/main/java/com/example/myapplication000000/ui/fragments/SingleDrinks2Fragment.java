package com.example.myapplication000000.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//import com.example.myapplication000000.databinding.Drinks1InfoBinding;


public class SingleDrinks2Fragment extends Fragment {
    Drinks1InfoBinding binding;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            String name = getArguments().getString("Name");
            int image = getArguments().getInt("Photo");
            binding.textView15.setText(name);
            binding.imageView3.setImageResource(image);
        }


    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = Drinks1InfoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
