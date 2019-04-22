package com.ltf.design.pattern.template;

public class XiaoMing extends DayLifeTemplate {
    @Override
    protected void moniring() {
        System.out.println("上午睡觉");
    }

    @Override
    protected void nong() {
        System.out.println("中午游泳");
    }

    @Override
    protected void night() {
        System.out.println("晚上散步");
    }

    @Override
    protected String getName() {
        return "小明";
    }
}
