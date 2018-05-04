package com.model_factory.main;

/**
 * 抽象产品类
 */
public abstract class IOHandler {

    /**
     * 添加一条信息
     */
    public abstract void add(String id,String name);

    /**
     * 删除一条信息
     */
    public abstract void remove(String id);

    /**
     * 修改一条信息
     */
    public abstract void update(String id,String name);

    /**
     * 添加一条信息
     */
    public abstract String query(String id);

}
