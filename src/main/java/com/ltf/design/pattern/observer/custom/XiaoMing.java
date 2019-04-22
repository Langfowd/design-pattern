package com.ltf.design.pattern.observer.custom;

public class XiaoMing implements Observer {

    @Override
    public void update(int price) {
        System.out.println("xiaoming : 我知道价格了 --》"+price);
    }
}
