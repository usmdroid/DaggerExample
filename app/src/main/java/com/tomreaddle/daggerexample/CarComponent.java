package com.tomreaddle.daggerexample;
import dagger.Component;

@Component (modules = WhilesModule.class)
public interface CarComponent {

    Car getCar();
    void inject(MainActivity mainActivity);
}
