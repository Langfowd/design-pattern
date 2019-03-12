package com.ltf.design.pattern.factory.simplefactory;

import com.ltf.design.pattern.factory.Milk;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        MilkSimpleFactory factory = new MilkSimpleFactory();
        Milk mengniu = factory.produceMilk(MilkSimpleFactory.MilkType.MENGNIU);
        Milk yili = factory.produceMilk(MilkSimpleFactory.MilkType.YILI);
        System.out.println(mengniu);
        System.out.println(yili);
    }
}
