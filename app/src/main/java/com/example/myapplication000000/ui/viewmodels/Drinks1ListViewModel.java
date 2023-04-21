package com.example.myapplication000000.ui.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.myapplication000000.data.models.Drinks1;
import com.example.myapplication000000.data.repository.Drinks1Repository;


import java.util.List;

public class Drinks1ListViewModel extends ViewModel {
    public LiveData<List<Drinks1>> drinks;

    public Drinks1ListViewModel() {
        Drinks1Repository drinksRepository = new Drinks1Repository();
        drinks = drinksRepository.getDrinks1Data();
    }
}

