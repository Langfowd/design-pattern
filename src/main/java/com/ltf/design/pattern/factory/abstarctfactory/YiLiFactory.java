package com.ltf.design.pattern.factory.abstarctfactory;

import com.ltf.design.pattern.factory.Milk;
import com.ltf.design.pattern.factory.YiLiMilk;

public class YiLiFactory extends AbstarctMilkFactory {
    @Override
    public Milk produceMilk() {
        return new YiLiMilk("伊利牛奶",55);
    }

    @Override
    public Candy produceCandy() {
        return new YiLiCandy("伊利牛奶糖",15);
    }
}
