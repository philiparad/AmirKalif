package com.example.amirkalif;

public class Musician {
    private final String name;
    private final int imageResId;

    public Musician(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }

    @Override
    public String toString() {
        return name;
    }
}
