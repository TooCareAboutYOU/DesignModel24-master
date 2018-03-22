package com.designmodel.main;

import android.app.Application;

/**
 * Created by zs on 2018/3/22.
 */

public class MyApplication extends Application {

    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static synchronized MyApplication getInstance(){ return instance; }
}
