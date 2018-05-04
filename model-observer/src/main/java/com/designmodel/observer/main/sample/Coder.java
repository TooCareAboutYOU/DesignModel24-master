package com.designmodel.observer.main.sample;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zs on 2018/5/3.
 */
public class Coder implements Observer {

    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.print("update: "+name+"\t更新,内容："+arg+"\n");
    }
}
