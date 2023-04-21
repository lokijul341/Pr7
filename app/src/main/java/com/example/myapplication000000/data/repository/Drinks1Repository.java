package com.example.myapplication000000.data.repository;

import androidx.lifecycle.LiveData;

import com.example.myapplication000000.data.datasources.Drinks1DataSource;
import com.example.myapplication000000.data.models.Drinks1;

import java.util.List;

public class Drinks1Repository {
    public LiveData<List<Drinks1>> getDrinks1Data() {
        return Drinks1DataSource.createList();
    }
}
