package com.ltf.design.pattern.builder;

/**
 * 具体的建造者
 */
public class XiaoHua implements Builder {
    @Override
    public void morning() {
        System.out.println("上午玩游戏");
    }

    @Override
    public void noon() {
        System.out.println("中午睡觉");
    }

    @Override
    public void night() {
        System.out.println("晚上游泳");
    }
}
