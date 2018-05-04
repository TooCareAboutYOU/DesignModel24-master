package com.model_abstract_factory.main.sample;

import com.model_abstract_factory.main.sample.factory.Q3Factory;
import com.model_abstract_factory.main.sample.factory.Q7Factory;

/**  抽象工厂类
 * 定义：为创建一组相关或者相互依赖的对象提供一个接口，而不是需要指定它们的具体类
 */
public class Test {
    public static void main(String[] args) {
        //构造一个生产Q3的工厂
        CarFactory q3CarFactory=new Q3Factory();
        q3CarFactory.createTire().tire();
        q3CarFactory.createEngine().engine();
        q3CarFactory.createBrake().brake();

        System.out.print("--------------------------\n");

        CarFactory q7CarFactory=new Q7Factory();
        q7CarFactory.createTire().tire();
        q7CarFactory.createEngine().engine();
        q7CarFactory.createBrake().brake();
    }
}
