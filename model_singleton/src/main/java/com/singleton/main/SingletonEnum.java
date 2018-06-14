package com.singleton.main;

/**枚举单例
 * 默认枚举单例的创建是线程安全的,而且在任何情况下都是单例
 *
 *  下面的单例模式的实现中,有一种情况下会重新创建对象,那就是反序列化:
 *  将一个单例对象写到磁盘再堵回来,从而获得一个实例.
 *  反序列化操作提供了readResolve 方法,这个方法可以让开发人
 *  员控制对象的反序列化.如要避免,需要加入如下方法:
 *  private Object readResolve() throws ObjextStreamException { return instance;  }
 *  也就是 readResolve 方法中将 instance 对象返回,而不是默认的重新生成一个新的对象,而对于枚举,并不存在这个问题.
 */
public enum  SingletonEnum {
    INSTANCE;
    public void doSomaThing(){

    }

}
