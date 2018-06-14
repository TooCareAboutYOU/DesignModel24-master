package com.singleton.main.hungryman;


/**在类加载时就完成了初始化,所以类加载较慢,但获取对象的速度快.
 * 这种基于类加载机制,避免了多线程同步的问题. 在类加载的时候就完成实例化,
 * 没有达到懒加载的效果,如果从始至终未使用过这个实例,就会造成内存的浪费;
 */
public class Singleton {
    private static final Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
