package com.ltf.design.pattern.strategy;

public class AliPay implements Pay {
    @Override
    public void pay(int price) {
        System.out.println("使用支付宝支付了："+price);
    }
}
