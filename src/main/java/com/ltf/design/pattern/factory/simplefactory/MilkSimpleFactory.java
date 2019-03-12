package com.ltf.design.pattern.factory.simplefactory;

import com.ltf.design.pattern.factory.MengNiuMilk;
import com.ltf.design.pattern.factory.Milk;
import com.ltf.design.pattern.factory.YiLiMilk;

/**
 * 简单工厂
 */
public class MilkSimpleFactory {

    /**
     * 生产牛奶
     * @return Milk
     */
    public Milk produceMilk(MilkType type) {
        switch (type) {
            case YILI:return new YiLiMilk("伊利",55);
            case MENGNIU:return new MengNiuMilk("蒙牛",45);
            default: return null;
        }

    }

    public enum MilkType{
        MENGNIU,YILI
    }

}
