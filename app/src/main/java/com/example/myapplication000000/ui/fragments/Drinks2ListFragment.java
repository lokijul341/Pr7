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
   // Drinks2ListBinding binding;
   // Drinks2ListViewModel drinks2ListViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    //    drinks2ListViewModel = new ViewModelProvider(this).get(Drinks2ListViewModel.class);
    }

}
