package com.designmodel.factory.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.designmodel.factory.main.factorymethod.BmwCar;
import com.designmodel.factory.main.simplemodel.Driver;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity_Fractory";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_SimpleFactory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //告诉司机今天开Bwm
                Car car= Driver.driverCar("Bmw");
                //下命令，开车
                car.drive();
            }
        });

        findViewById(R.id.btn_FactoryMethod).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                com.designmodel.factory.main.factorymethod.Driver driver=new BmwCar();
                Car car=driver.driverCar();
                car.drive();
            }
        });

        findViewById(R.id.btn_AbstractFactory).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
