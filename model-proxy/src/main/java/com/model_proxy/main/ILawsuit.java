package com.model_proxy.main;

/**
 * 诉讼接口类
 */
public interface ILawsuit {
    void submit(String s); // 提交申请
    void burden(String s); // 进行举证
    void defend(String s); // 开始辩护
    void finish(String s); // 诉讼完成
}
