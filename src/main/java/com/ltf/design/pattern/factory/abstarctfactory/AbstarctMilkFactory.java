package com.ltf.design.pattern.factory.abstarctfactory;

import com.ltf.design.pattern.factory.Milk;

public abstract class AbstarctMilkFactory {
   // 生产牛奶
   public abstract Milk produceMilk();
   // 生产牛奶糖
   public abstract Candy produceCandy();
}
