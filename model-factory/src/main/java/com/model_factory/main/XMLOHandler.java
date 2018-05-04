package com.model_factory.main;

/**
 * XML存储
 */
public class XMLOHandler extends IOHandler {
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
