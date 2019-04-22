package com.ltf.design.pattern.observer.custom;

public class XiaoHua implements Observer {

    @Override
    public void update(int price) {
        System.out.println("xiaohua : 我知道价格了 --》"+price);
    }
}
