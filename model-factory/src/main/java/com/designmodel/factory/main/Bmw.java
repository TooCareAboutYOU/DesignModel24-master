package com.designmodel.factory.main;

import android.util.Log;

/**
 *具体产品角色
 */

public class Bmw implements Car {

    @Override
    public void drive() {
        Log.i(MainActivity.TAG, "drive: Bwm");
    }
}
