package com.example.myapplication000000.data.models;


public class Drinks2 {

    int image;
    String name;
    String ml;

    public Drinks2(int image, String name, String ml) {
        this.image = image;
        this.name = name;
        this.ml = ml;
    }

    public String getDrinks2() {
        return ml;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public void setAuthor(String author) {
        this.ml = author;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }
}

