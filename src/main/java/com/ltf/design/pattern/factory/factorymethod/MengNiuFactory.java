package com.ltf.design.pattern.factory.factorymethod;

import com.ltf.design.pattern.factory.MengNiuMilk;
import com.ltf.design.pattern.factory.Milk;

public class MengNiuFactory implements MilkMethodFactory {
    @Override
    public Milk produceMilk() {
        return new MengNiuMilk("蒙牛",45);
    }
}
