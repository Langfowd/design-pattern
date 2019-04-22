package com.ltf.design.pattern.strategy;

public class WeixinPay implements Pay {
    @Override
    public void pay(int price) {
        System.out.println("使用微信支付了："+price);
    }
}
