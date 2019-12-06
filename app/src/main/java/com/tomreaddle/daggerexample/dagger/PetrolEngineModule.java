package com.tomreaddle.daggerexample.dagger;

import com.tomreaddle.daggerexample.car.Engine;
import com.tomreaddle.daggerexample.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
