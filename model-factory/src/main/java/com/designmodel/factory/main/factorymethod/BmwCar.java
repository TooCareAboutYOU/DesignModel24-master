package com.designmodel.factory.main.factorymethod;


import com.designmodel.factory.main.Bmw;
import com.designmodel.factory.main.Car;

/**
 *
 */

public class BmwCar implements Driver {

    @Override
    public Car driverCar() {
        return new Bmw();
    }
}
