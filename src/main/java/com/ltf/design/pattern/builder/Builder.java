package com.ltf.design.pattern.builder;

/**
 * 建造者模式 有点类似于模板
 * 建造者 定义所有需要的方法
 * 监工 监督建造的流程
 * 具体的建造者 实现具体的建造方法
 *
 * 定义早中晚如何度过
 */
public interface Builder {
    void morning();
    void noon();
    void night();
}
