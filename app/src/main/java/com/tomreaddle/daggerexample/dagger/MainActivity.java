package com.tomreaddle.daggerexample.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tomreaddle.daggerexample.R;
import com.tomreaddle.daggerexample.car.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);

        car.drive();
        //car = carComponent.getCar();
    }
}
