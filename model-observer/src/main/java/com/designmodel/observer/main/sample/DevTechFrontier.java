package com.designmodel.observer.main.sample;

import android.util.Log;

import java.util.Observable;


public class DevTechFrontier extends Observable {

    private static final String TAG = "DevTechFrontier";

    public void postNewPublication(String content){
        System.out.print("DevTechFrontier : "+content+"\n");

        //标识状态或者内容发生变化
        setChanged();

        //通知所有的观察者
        notifyObservers(content);
    }

}
