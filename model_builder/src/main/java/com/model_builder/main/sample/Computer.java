package com.model_builder.main.sample;

/**
 * 计算机抽象类
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    public Computer() {
    }

    //设置主板
    public void setBoard(String board) {
        mBoard = board;
    }

    //设置显示器
    public void setDisplay(String display) {
        mDisplay = display;
    }

    //设置操作系统
    public abstract void setOS();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"mBoard\":\"")
                .append(mBoard).append('\"');
        sb.append(",\"mDisplay\":\"")
                .append(mDisplay).append('\"');
        sb.append(",\"mOS\":\"")
                .append(mOS).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
