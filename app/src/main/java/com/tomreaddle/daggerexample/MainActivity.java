package com.tomreaddle.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Car car;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);

        CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getCar();
        text.setText(car.drive());
    }
}
