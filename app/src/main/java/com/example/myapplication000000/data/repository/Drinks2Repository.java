package com.example.myapplication000000.data.repository;

import androidx.lifecycle.LiveData;

import com.example.myapplication000000.data.datasources.Drinks2DataSource;
import com.example.myapplication000000.data.models.Drinks2;

import java.util.List;

public class Drinks2Repository {
    public LiveData<List<Drinks2>> getDrinks2Data() {
        return Drinks2DataSource.createList();
    }
}


