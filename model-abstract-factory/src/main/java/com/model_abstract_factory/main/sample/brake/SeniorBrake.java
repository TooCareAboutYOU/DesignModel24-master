package com.model_abstract_factory.main.sample.brake;

/**
 * Created by zs on 2018/5/3.
 */
public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.print("高级制动\n");
    }
}
