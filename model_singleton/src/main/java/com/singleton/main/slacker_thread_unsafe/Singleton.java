package com.singleton.main.slacker_thread_unsafe;

import android.annotation.SuppressLint;

/** 懒汉模式(线程不安全)
 * 懒汉模式声明了一个静态对象,在用户第一次调用时初始化,
 * 这虽然节约了资源,但第一次加载时需要实例化,反应稍慢一些,且在多线程时不能正常工作;
 */
public class Singleton {

    @SuppressLint("StaticFieldLeak")
    private static Singleton instance;
    private Singleton(){}
    @SuppressLint("StaticFieldLeak")
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

}
