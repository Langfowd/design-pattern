package com.ltf.design.pattern.adapter;

/**
 * 产生100V电压
 */
public class VolatageFor100 implements Volatage{

    @Override
    public int produceElectricity() {
        return 100;
    }
}
