package com.model_proxy.main;

/**
 * Created by zs on 2018/5/4.
 */
public class ProxyLawyer implements ILawsuit {

    Person mPerson;

    public ProxyLawyer(Person person) {
        mPerson = person;
    }

    @Override
    public void submit(String s) {
        mPerson.submit(s);
    }

    @Override
    public void burden(String s) {
        mPerson.burden(s);
    }

    @Override
    public void defend(String s) {
        mPerson.defend(s);
    }

    @Override
    public void finish(String s) {
        mPerson.finish(s);
    }
}
