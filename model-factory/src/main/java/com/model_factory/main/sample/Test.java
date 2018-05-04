package com.model_factory.main.sample;

/**  工厂模式
 * 定义：一个用于创建对象的接口，让子类决定实例化哪个对象
 * 场景：需要生成复杂对象的地方
 */
public class Test {

    public static void main(String[] args) {
        Factory factory=new ConcreteFactory();
        Product product=factory.createProduct(ConcreteProductA.class);
        product.method();

        Product product2=factory.createProduct(ConcreteProductB.class);
        product2.method();
    }
}
