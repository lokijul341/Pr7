package com.example.myapplication000000.data.datasources;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.myapplication000000.R;
import com.example.myapplication000000.data.models.Drinks2;

import java.util.ArrayList;
import java.util.List;

public class Drinks2DataSource {

    private static ArrayList<Drinks2> drinksList;


    public static LiveData<List<Drinks2>> createList() {
        drinksList = new ArrayList<>();
        drinksList.add(new Drinks2(R.drawable.water,"Вода","500 мл"));
        drinksList.add(new Drinks2(R.drawable.milk,"Молоко","250 мл"));
        drinksList.add(new Drinks2(R.drawable.greentea,"Чай зеленый","300 мл"));
        drinksList.add(new Drinks2(R.drawable.cocowater,"Кокосовая вода","300 мл"));
        drinksList.add(new Drinks2(R.drawable.gaswater,"Газированная вода","500 мл"));
        drinksList.add(new Drinks2(R.drawable.yogurt,"Кисломолочные напитки","250 мл"));
        MutableLiveData<List<Drinks2>> list = new MutableLiveData<>();
        list.setValue(drinksList);
        return list;
    }
}

