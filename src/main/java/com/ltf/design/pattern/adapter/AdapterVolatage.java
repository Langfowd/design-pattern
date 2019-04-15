package com.ltf.design.pattern.adapter;

/**
 * 适配器  拥有自己的200V电压 也可以产生100V电压
 * 可以通过依赖，也可以通过继承的方式来实现适配器
 */
public class AdapterVolatage implements Volatage{
    private Volatage volatageFor100;

    public AdapterVolatage(Volatage volatageFor100) {
        this.volatageFor100 = volatageFor100;
    }

    @Override
    public int produceElectricity() {
        return 200;
    }

    public int produceElectriciryFor100() {
        return volatageFor100.produceElectricity();
    }
}
