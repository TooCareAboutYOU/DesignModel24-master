package com.singleton.main;


import android.annotation.SuppressLint;

/**第一次加载 Singleton 类时并不会初始化 sInstance ,
 * 只有第一次调用getInstance方法时虚拟机加载 SingletonHolder
 * 并初始化 sInstance . 这样不仅能确保线程安全,也能保证 Singleton
 * 类的唯一性,同时也延迟了单例的实例化. 所以,推荐使用静态内部类单例模式;
 */
public class SingletonStaticInnerClass {

    private SingletonStaticInnerClass(){}
    @SuppressLint("StaticFieldLeak")
    public static SingletonStaticInnerClass getInstance(){ return SingletonStaticInnerClassHolder.instance; }
    private static class SingletonStaticInnerClassHolder{
        @SuppressLint("StaticFieldLeak")
        private static final SingletonStaticInnerClass instance=new SingletonStaticInnerClass();
    }

}
