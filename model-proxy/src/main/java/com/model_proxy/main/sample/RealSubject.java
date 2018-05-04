package com.model_proxy.main.sample;

/**
 * 实现抽象主题的真实主题类
 */
public class RealSubject extends Subject {
    @Override
    public void visit() {
        System.out.print("RealSubject");
    }
}
