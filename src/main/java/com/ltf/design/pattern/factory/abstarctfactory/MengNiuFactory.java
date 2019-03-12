package com.ltf.design.pattern.factory.abstarctfactory;

import com.ltf.design.pattern.factory.MengNiuMilk;
import com.ltf.design.pattern.factory.Milk;

public class MengNiuFactory extends AbstarctMilkFactory {
    @Override
    public Milk produceMilk() {
        return new MengNiuMilk("蒙牛牛奶",45);
    }

    @Override
    public Candy produceCandy() {
        return new MengNiuCandy("蒙牛牛奶糖",10);
    }
}
