package com.model_factory.main;

/**
 * 文件存储
 */
public class FileIOHandler extends IOHandler {
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
