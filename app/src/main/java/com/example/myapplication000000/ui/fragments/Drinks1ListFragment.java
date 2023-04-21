package com.example.myapplication000000.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication000000.ui.adapters.MyCustomDrinks1ListAdapter;
import com.example.myapplication000000.R;

import com.example.myapplication000000.databinding.Drinks1ListBinding;
import com.example.myapplication000000.ui.viewmodels.Drinks1ListViewModel;

public class Drinks1ListFragment extends Fragment{

    RecyclerView recyclerView;
    MyCustomDrinks1ListAdapter myCustomListAdapter;
    Drinks1ListBinding binding;
    Drinks1ListViewModel drinks1ListViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        drinks1ListViewModel = new ViewModelProvider(this).get(Drinks1ListViewModel.class);
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = Drinks1ListBinding.inflate(inflater, container, false);
        myCustomListAdapter = new MyCustomDrinks1ListAdapter();// создание адаптера
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_drinks1_list_fragment_to_profile_fragment);
            }
        });
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(myCustomListAdapter);
        drinks1ListViewModel.drinks.observe(getViewLifecycleOwner(), drinksList ->
                myCustomListAdapter.updateDrinks1(drinksList));
    }
}



