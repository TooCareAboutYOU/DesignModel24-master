package com.model_factory.main.sample;

/**
 * 具体产品类 A
 */
public class ConcreteProductA extends Product {
    @Override
    public void method() {
        System.out.print("I am "+getClass().getSimpleName()+"\n");
    }
}
