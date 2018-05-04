package com.model_abstract_factory.main.sample.brake;

/**
 * Created by zs on 2018/5/3.
 */
public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.print("普通制动\n");
    }
}
