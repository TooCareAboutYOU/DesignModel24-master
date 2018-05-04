package com.model_proxy.main;

/**
 * 具体诉讼人
 */
public class Person implements ILawsuit {
    @Override
    public void submit(String s) {
        System.out.print(s+"：提交代理\n");
    }

    @Override
    public void burden(String s) {
        System.out.print(s+"：进行举证\n");
    }

    @Override
    public void defend(String s) {
        System.out.print(s+"：开始辩护\n");
    }

    @Override
    public void finish(String s) {
        System.out.print(s+"：诉讼完成\n");
    }
}
