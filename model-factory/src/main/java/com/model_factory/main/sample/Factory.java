package com.model_factory.main.sample;

/**
 * 抽象工厂类
 */
public abstract class Factory {
    /**
     * 抽象工厂方法
     * 具体生成什么有子类去实现
     * @return  具体的产品对象
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
