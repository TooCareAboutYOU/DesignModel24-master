package com.designmodel.factory.main.simplemodel;

import com.designmodel.factory.main.Bmw;
import com.designmodel.factory.main.Car;

/**
 * 工厂类角色
 */

public class Driver {

    //工厂方法，注意 返回类型为抽象产品角色
    public static Car driverCar(String str){
        Car car=null;
        //逻辑判断，返回具体的产品角色给client
        switch (str) {
            case "Bmw":{
                car= new Bmw();
                break;
            }
        }
        return car;
    }

}
