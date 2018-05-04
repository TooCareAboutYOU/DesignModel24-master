package com.model_factory.main;

/**
 * 具体工程类
 */
public  class IOFactory {
    public static <T extends IOHandler> T getIOHandler(Class<T> clz){
        IOHandler ioHandler=null;
        try {
            ioHandler= (IOHandler) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) ioHandler;
    }

}
