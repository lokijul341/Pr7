package com.example.myapplication000000.ui.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication000000.data.models.Drinks2;
import com.example.myapplication000000.data.repository.Drinks2Repository;


import java.util.List;

public class Drinks2ListViewModel extends ViewModel {
    public LiveData<List<Drinks2>> drinks;

    public Drinks2ListViewModel() {
        Drinks2Repository drinks2Repository = new Drinks2Repository();
        drinks = drinks2Repository.getDrinks2Data();
    }
}

