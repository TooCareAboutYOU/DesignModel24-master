package com.model_abstract_factory.main.sample.factory;

import com.model_abstract_factory.main.sample.CarFactory;
import com.model_abstract_factory.main.sample.brake.IBrake;
import com.model_abstract_factory.main.sample.brake.NormalBrake;
import com.model_abstract_factory.main.sample.brake.SeniorBrake;
import com.model_abstract_factory.main.sample.engine.DomesticEngine;
import com.model_abstract_factory.main.sample.engine.IEngine;
import com.model_abstract_factory.main.sample.engine.ImportEngine;
import com.model_abstract_factory.main.sample.tire.ITire;
import com.model_abstract_factory.main.sample.tire.NormalTire;
import com.model_abstract_factory.main.sample.tire.SUVTire;

/**
 * Created by zs on 2018/5/4.
 */
public class Q7Factory extends CarFactory {
    
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
