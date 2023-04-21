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
//import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication000000.ui.adapters.MyCustomListAdapter;
import com.example.myapplication000000.R;
//import com.example.myapplication000000.databinding.Drinks2ListBinding;
//import com.example.myapplication000000.ui.viewmodels.Drinks2ListViewModel;

public class Drinks2ListFragment extends Fragment {
    RecyclerView recyclerView;
    MyCustomListAdapter myCustomListAdapter;
    Drinks2ListBinding binding;
    Drinks2ListViewModel drinks2ListViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        drinks2ListViewModel = new ViewModelProvider(this).get(Drinks2ListViewModel.class);
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = Drinks2ListBinding.inflate(inflater, container, false);
        myCustomListAdapter = new MyCustomListAdapter();
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_drinks2_list_fragment_to_profile_fragment);
            }
        });
        if (getArguments()!=null)
        {
            Toast.makeText(getContext(), "Вы оценили напиток на "+getArguments().getFloat("Rating"), Toast.LENGTH_SHORT).show();
        }
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(myCustomListAdapter);
        drinks2ListViewModel.drinks.observe(getViewLifecycleOwner(), drinksList ->
                myCustomListAdapter.updateDrinks2(drinksList));
    }
}

