package com.tomreaddle.daggerexample.car;

import android.util.Log;

import javax.inject.Inject;

public class DeiselEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public DeiselEngine(){

    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started");
    }
}
