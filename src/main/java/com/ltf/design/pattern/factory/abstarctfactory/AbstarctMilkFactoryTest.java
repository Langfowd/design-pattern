package com.ltf.design.pattern.factory.abstarctfactory;

public class AbstarctMilkFactoryTest {
    public static void main(String[] args) {
        AbstarctMilkFactory mengNiuFactory = new MengNiuFactory();
        System.out.println(mengNiuFactory.produceCandy());
        System.out.println(mengNiuFactory.produceMilk());
        AbstarctMilkFactory yiLiFactory = new YiLiFactory();
        System.out.println(yiLiFactory.produceCandy());
        System.out.println(yiLiFactory.produceMilk());
    }
}
