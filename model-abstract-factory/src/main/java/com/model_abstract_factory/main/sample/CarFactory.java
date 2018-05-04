package com.model_abstract_factory.main.sample;

import com.model_abstract_factory.main.sample.brake.IBrake;
import com.model_abstract_factory.main.sample.engine.IEngine;
import com.model_abstract_factory.main.sample.tire.ITire;

/**
 * 抽象车厂类
 */
public abstract class CarFactory {
    /**
     * 生产轮胎
     */
    public abstract ITire createTire();

    /**
     * 生产发动机
     */
    public abstract IEngine createEngine();

    /**
     * 生产制动系统
     */
    public abstract IBrake createBrake();
}
