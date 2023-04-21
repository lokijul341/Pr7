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

import com.example.myapplication000000.ui.adapters.MyCustomDrinks1ListAdapter;
import com.example.myapplication000000.R;

//import com.example.myapplication000000.databinding.Drinks1ListBinding;
//import com.example.myapplication000000.ui.viewmodels.Drinks1ListViewModel;

public class Drinks1ListFragment extends Fragment {

    RecyclerView recyclerView;
    MyCustomDrinks1ListAdapter myCustomListAdapter;
    //   Drinks1ListBinding binding;
    //   Drinks1ListViewModel drinks1ListViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
    }
}

