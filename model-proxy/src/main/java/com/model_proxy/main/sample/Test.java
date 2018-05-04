package com.model_proxy.main.sample;

/**    代理模式
 * 定义：为其他对象一种代理以控制对这个对象的访问
 * 使用场景：
 *     当无法或不想直接访问某个对象或者访问某个对象存在困难时可以通过一个代理对象来简介访问，
 *     为了保证客户端使用的透明性，委托对象与代理对象需要实现相同的接口
 */
public class Test {

    public static void main(String[] args) {
        // 构造一个真实主题对象
        RealSubject realSubject=new RealSubject();
        //通过真实主题对象构造一个代理对象
        ProxySubject proxySubject=new ProxySubject(realSubject);
        //调用代理的相关方法
        proxySubject.visit();
    }
}
