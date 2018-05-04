package com.designmodel.observer.main.sample;

/** 观察者模式
 *1、首先观看Observable和Observer的源码,会发现实际观察者模式原理很容易理解
 */
public class Test {


    public static void main(String[] args) {

        //被观察者角色
        DevTechFrontier devTechFrontier=new DevTechFrontier();
        //观察者
        for (int i = 1; i <= 5; i++) {
            Coder coder=new Coder("发送给第 "+i+" 个观察者");
            devTechFrontier.addObserver(coder);
        }

        devTechFrontier.postNewPublication("来自被观察者的消息-----》》》");
    }
}
