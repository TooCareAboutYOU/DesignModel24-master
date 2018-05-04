package com.model_abstract_factory.main.sample.tire;

/**
 *
 */
public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.print("普通轮胎\n");
    }
}
