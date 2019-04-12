package com.ltf.design.pattern.builder;

/**
 * 具体的建造者
 */
public class XiaoMing implements Builder {
    @Override
    public void morning() {
        System.out.println("上午睡觉");
    }

    @Override
    public void noon() {
        System.out.println("中午看电视");
    }

    @Override
    public void night() {
        System.out.println("晚上玩游戏");
    }
}
