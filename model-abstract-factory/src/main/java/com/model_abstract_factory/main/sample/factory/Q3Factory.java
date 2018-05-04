package com.model_abstract_factory.main.sample.factory;

import com.model_abstract_factory.main.sample.CarFactory;
import com.model_abstract_factory.main.sample.brake.IBrake;
import com.model_abstract_factory.main.sample.brake.NormalBrake;
import com.model_abstract_factory.main.sample.engine.DomesticEngine;
import com.model_abstract_factory.main.sample.engine.IEngine;
import com.model_abstract_factory.main.sample.tire.ITire;
import com.model_abstract_factory.main.sample.tire.NormalTire;

/**
 * Created by zs on 2018/5/4.
 */
public class Q3Factory extends CarFactory {

    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
