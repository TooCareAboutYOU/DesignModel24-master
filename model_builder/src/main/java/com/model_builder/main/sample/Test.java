package com.model_builder.main.sample;

/**   Builder模式
 * 定义：将一个复杂对象的构建与它分离，使得同样的构建过程可以创建不同的表示
 * 使用场景：
 *      1、相同的方法，不同的执行顺序，产生不同的时间结果时；
 *      2、多个部件或者零件，都可以装配一个对象中，但是产生的运行时结果又不相同时；
 *      3、产品类非常复杂，或者产品类中的调用顺序不同产生了不同的作用，此时使用建造者模式非常合适；
 *      4、当初始化一个对象特别复杂，如参数多，且很多参数都具有默认值时。
 *
 *  UML角色：
 *  1、Product产品类：产品的抽象类；
 *  2、Builder：抽象Builder类，规范产品的组建，一般是由子类实现具体的组建过程；
 *  3、ConcreteBuilder：具体的Builder类；
 *  4、Director：统一组装过程。
 */
public class Test {
    public static void main(String[] args) {
        //构造器
        Builder builder=new MacBookBuilder();
        //Director
        Director director=new Director(builder);  //这步可忽略简写
        //封装构建过程
        director.construct("英特尔主板","Retina显示器");
        System.out.print("Computer info : "+builder.create().toString());
    }
}
