package com.ltf.design.pattern.strategy;

public enum  PayStrategy {

    ALI_PAY(new AliPay()),
    WEIXIN_PAY(new WeixinPay()),
    BLANK_PAY(new BankPay());

    private Pay pay;

    public Pay getPay() {
        return pay;
    }

    PayStrategy(Pay pay) {
        this.pay = pay;
    }

    public static Pay getPay(PayStrategy payType) {
        return payType.getPay();
    }
}
