package com.ltf.design.pattern.template;

public class XiaoHua extends DayLifeTemplate {
    @Override
    protected void moniring() {
        System.out.println("上午跑步");
    }

    @Override
    protected void nong() {
        System.out.println("中午睡觉");
    }

    @Override
    protected void night() {
        System.out.println("晚上看电影");
    }

    @Override
    protected String getName() {
        return "小华";
    }
}
