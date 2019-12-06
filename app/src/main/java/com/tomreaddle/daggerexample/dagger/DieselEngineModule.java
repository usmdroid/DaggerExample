package com.tomreaddle.daggerexample.dagger;

import com.tomreaddle.daggerexample.car.DeiselEngine;
import com.tomreaddle.daggerexample.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DeiselEngine engine);
}
