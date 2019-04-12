package com.ltf.design.pattern.builder;

/**
 * 监工角色 定义一天的逻辑
 */
public class Monitor {
    private Builder builder;

    public Monitor(Builder builder) {
        this.builder = builder;
    }

    /**
     * 定义一天内如何度过的
     */
    public void oneDay() {
        builder.morning();
        builder.noon();
        builder.night();
    }
}
