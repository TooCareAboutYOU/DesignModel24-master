package com.model_abstract_factory.main.sample.engine;

/**
 * Created by zs on 2018/5/4.
 */
public class DomesticEngine implements IEngine {
    @Override
    public void engine() {
        System.out.print("国产发动机\n");
    }
}
