package com.model_proxy.main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class DynamicProxy implements InvocationHandler {

    //被代理的类引用
    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用代理类对象的方法
        return method.invoke(obj,args);
    }
}
