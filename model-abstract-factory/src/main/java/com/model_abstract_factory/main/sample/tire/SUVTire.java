package com.model_abstract_factory.main.sample.tire;

/**
 *
 */
public class SUVTire implements ITire {
    @Override
    public void tire() {
        System.out.print("越野轮胎\n");
    }
}
