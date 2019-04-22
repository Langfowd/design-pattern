package com.ltf.design.pattern.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        PayStrategy.getPay(PayStrategy.ALI_PAY).pay(11);
    }
}
