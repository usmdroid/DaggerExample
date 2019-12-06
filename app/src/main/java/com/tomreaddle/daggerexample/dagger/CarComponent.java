package com.tomreaddle.daggerexample.dagger;
import com.tomreaddle.daggerexample.car.Car;

import dagger.Component;

@Component (modules = {WhilesModule.class , DieselEngineModule.class})
public interface CarComponent {

    Car getCar();
    void inject(MainActivity mainActivity);
}
