package com.singleton.main.hungryman.simples;

import com.singleton.main.PrintUtil;

/**
 *  CEO 饿汉模式
 */
public class CEO extends Staff{

    private static final CEO ourInstance = new CEO();
    public static CEO getInstance() { return ourInstance; }
    private CEO() { }

    //公共的景甜函数，对外暴露获取单例对象的接口
    public static CEO getCEO(){ return ourInstance; }

    @Override
    public void work() {
//        super.work();
        PrintUtil.printUtil("CEO");
    }
}
