package com.ltf.design.pattern.factory.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        MilkMethodFactory yiLiFactory = new YiLiFactory();
        System.out.println(yiLiFactory.produceMilk());
        MilkMethodFactory mengNiuFactory = new MengNiuFactory();
        System.out.println(mengNiuFactory.produceMilk());
    }
}
