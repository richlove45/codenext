package com.example.android.spotifly;

public class Categoryitem {
    private String name;
    private int photo;

    //constructor//
    public Categoryitem(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    //Getter methods to get name, photo id//
    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }

}