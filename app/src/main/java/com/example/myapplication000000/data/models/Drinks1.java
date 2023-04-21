package com.example.myapplication000000.data.models;

public class Drinks1 {
    String name;
    int photo;
    
    public Drinks1(String name, int photo)
    {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }


    public int getPhoto() {
        return photo;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
