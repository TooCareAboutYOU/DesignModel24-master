package com.singleton.main;

import android.annotation.SuppressLint;
import android.content.Context;

/**优点就是资源利于率高,第一次执行getInstance时单例对象才被实例化,效率高.
 * 缺点是在第一次加载时反应稍微慢一点,在高并发环境下也有一定的缺陷,
 * DCL虽然在一定程度上解决了资源的消耗和多余的同步,线程安全问题,
 * 但在某些情况下还是会出现失效的问题,也就是DCL 失效.
 * 所以建议用静态内部类单例模式来替代DCL.
 *
 *  DCL 失效: instance = new Singleton(); 这句代码,它并不是一个原子操作,
 *  这句代码最终会被编译成多条汇编指令:
 *      1、给 Singleton 的实例分配内存.
 *      2、调用 Singleton() 的构造函数,初始化成员字段.
 *      3、将 instance 对象指向分配的内存空间(此时 instance 就不是 null 了).
 *
 *
 */
public class SingletonDCL {
    @SuppressLint("StaticFieldLeak")
    private static volatile SingletonDCL instance=null;
    private SingletonDCL(){}
    @SuppressLint("StaticFieldLeak")
    private static Context mContext;
    @SuppressLint("StaticFieldLeak")
    public static synchronized SingletonDCL getInstance(Context context){
        mContext= context.getApplicationContext();
        if(instance==null){   //为了不必要的同步
            synchronized(SingletonDCL.class){
                if(instance==null){  // instance=null的时候才创建实例
                    instance=new SingletonDCL();
                }
            }
        }
        return instance;
    }
}
