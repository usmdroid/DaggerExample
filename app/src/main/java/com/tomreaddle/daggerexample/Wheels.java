package com.tomreaddle.daggerexample;

public class Wheels {
    private static final String TAG = "Car";

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
