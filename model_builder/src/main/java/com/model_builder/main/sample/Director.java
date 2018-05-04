package com.model_builder.main.sample;

/**
 * 负责构造Computer
 */
public class Director {
    Builder mBuilder=null;

    public Director(Builder builder) {
        mBuilder = builder;
    }

    //构造对象
    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOS();
    }
}
