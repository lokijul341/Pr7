package com.example.myapplication000000.data.datasources;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.myapplication000000.R;
import com.example.myapplication000000.data.models.Drinks1;

import java.util.ArrayList;
import java.util.List;

public class Drinks1DataSource {
    private static ArrayList<Drinks1> drinksList;

    public static LiveData<List<Drinks1>> createList() {
        drinksList = new ArrayList<>();
        drinksList.add(new Drinks1("Кофе",R.drawable.coffee));
        drinksList.add(new Drinks1("Сок",R.drawable.juice));
        MutableLiveData<List<Drinks1>> list = new MutableLiveData<>();
        list.setValue(drinksList);
        return list;
    }
}
