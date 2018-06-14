package com.singleton.main.slacker_thread_safe;

import android.annotation.SuppressLint;
import android.content.Context;

/** 这种写法能够在多线程中很好的工作,但每次调用getInstance方法时
 * 都需要进行同步,这个会造成不必要的同步开销,而且大部分的时候我们用不到同步的,
 * 所以,不建议用这种模式;
 */
public class Singleton {
    @SuppressLint("StaticFieldLeak")
    private static Singleton instance;
    private Singleton(){}
    @SuppressLint("StaticFieldLeak")
    public static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
