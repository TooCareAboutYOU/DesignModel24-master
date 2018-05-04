package com.model_factory.main;

/**
 * 数据库存储
 */
public class DBOHandler extends IOHandler {
    @Override
    public void add(String id, String name) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void update(String id, String name) {

    }

    @Override
    public String query(String id) {
        return "I am from"+getClass().getSimpleName();
    }
}
