package com.model_proxy.main;

import android.hardware.SensorManager;

import java.lang.reflect.Proxy;

/**
 * Created by zs on 2018/5/4.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 静态代理
         */
        Person person=new Person();
        ILawsuit iLawsuit=new ProxyLawyer(person);
        iLawsuit.submit("静态代理");
        iLawsuit.burden("静态代理");
        iLawsuit.defend("静态代理");
        iLawsuit.finish("静态代理");


        /**
         * 动态代理
         */
        Person person1=new Person();
        DynamicProxy dynamicProxy=new DynamicProxy(person1);
        ClassLoader classLoader=person1.getClass().getClassLoader();

        ILawsuit lawsuit= (ILawsuit) Proxy.newProxyInstance(classLoader,new Class[]{ILawsuit.class},dynamicProxy);
        lawsuit.submit("\n动态代理");
        lawsuit.burden("动态代理");
        lawsuit.defend("动态代理");
        lawsuit.finish("动态代理");

    }
}
