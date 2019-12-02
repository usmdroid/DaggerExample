package com.tomreaddle.daggerexample;

import dagger.Module;
import dagger.Provides;

@Module
public class WhilesModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims , Tires tires){
        return new Wheels(rims , tires);
    }
}
