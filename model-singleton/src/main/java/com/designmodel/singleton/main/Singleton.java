package com.designmodel.singleton.main;

import java.util.HashMap;

/**
 *
 */

public class Singleton {

    /**
     * 饿汉模式
     *
     * 在自己内部定义自己的一个实例
     * 注意这是private指提供内部使用
     * private static Singleton instance=new Singleton();
     *
     * //将构造函数设置为私有
     * private Singleton(){ }
     *
     * 静态工厂方法，提供了一个供外部访问得到对象的静态方法
     * public static Singleton getInstance(){ return instance; }
     *
     */


    /**
     * 懒汉模式
     *
     * private static Singleton instance=null;
     *
     * //将构造函数设置为私有
     * private Singleton(){ }
     *
     * 静态工厂方法
     * public static synchronized Singleton getInstance(){
     *    if (instance == null) {
     *        instance=new Singleton();
     *    }
     *    return instance;
     * }
     *
     */

    /**
     * 总结：
     * 1、懒汉模式中，对静态工厂进行了同步处理，原因是为了防止多线程环境中产生多个实例；而饿汉模式不存在这个情况
     * 2、懒汉模式中 将类对自己的实例化延迟到了第一次被引用的时候，而饿汉模式中则是在类被加载的时候实例化，这样多次加载会造成多次实例化。
     *    但是懒汉模式由于使用了同步处理，在反应速度上要比饿汉模式慢一些
     * 3、懒汉、饿汉模式均是去了多态性，不允许被集成。
     * 4、将构造函数设置为均受保护的，这样允许被继承产生子类；
     *    实现：将父类中获得的对象的静态方法放到子类中再实现；也可以在父类的静态方法中进行条件判断决定哪一个对象；
     * 5、在GOF中认为最好的一种方式是维护一张存有对象和对应名称的注册表（例如 HashMap）
     *
     */



    /**
     * HashMap 带有注册表的实现
     */
    //用来存放对应关系
    private static HashMap sinRegistry=new HashMap();
    static private Singleton s=new Singleton();
    //受保护的构造函数
    protected Singleton(){}
    public static Singleton getInstance(String name){
        if (name == null) {
            name="Singleton";
        }

        if (sinRegistry.get(name) == null) {
            try {
                sinRegistry.put(name,Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return (Singleton) sinRegistry.get(name);
    }

    public void test(){
        System.out.printf("Singleton  getClassSuccess");
    }

    public class SingletonChild extends Singleton{
        public SingletonChild() {
        }

        public SingletonChild getInstance(){
            return (SingletonChild) Singleton.getInstance("SingletonChild");
        }

        public void test(){
            System.out.printf("SingletonChild  getClassSuccess");
        }
    }

    /**
     * 由于在java子类的构造函数的范围不能比父类的小，所以可能存在不守规则的客户程序应用使用其函数来产生实例，造成单例模式失效
     *
     * 当某个类永远是单例 可以选用以下方式：
     * public static final Singleton SINGLETON=new Singleton();
     * 此方式在不改变API的情况下，改变我们对单例类的具体要求
     */



}
