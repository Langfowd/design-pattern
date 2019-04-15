package com.ltf.design.pattern.adapter;

public class TestAdapter {
    public static void main(String[] args) {
        VolatageFor100 for100 = new VolatageFor100();
        System.out.println(for100.produceElectricity());
        AdapterVolatage for200 = new AdapterVolatage(for100);
        System.out.println(for200.produceElectricity());
        System.out.println(for200.produceElectriciryFor100());
    }
}
