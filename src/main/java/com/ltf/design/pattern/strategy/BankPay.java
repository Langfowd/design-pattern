package com.ltf.design.pattern.strategy;

public class BankPay implements Pay {
    @Override
    public void pay(int price) {
        System.out.println("使用银行卡支付了："+price);
    }
}
