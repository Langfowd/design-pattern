package com.ltf.design.pattern.factory.factorymethod;

import com.ltf.design.pattern.factory.Milk;
import com.ltf.design.pattern.factory.YiLiMilk;

public class YiLiFactory implements MilkMethodFactory {
    @Override
    public Milk produceMilk() {
        return new YiLiMilk("伊利",55);
    }
}
