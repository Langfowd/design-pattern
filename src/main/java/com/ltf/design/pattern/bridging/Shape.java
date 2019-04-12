package com.ltf.design.pattern.bridging;

/**
 * 桥接模式思维要转向面向抽象编程
 * 在抽象层定义两个不同类型之间的关系，不需要继承，将两种类型解耦开了
 */
public abstract class Shape {
    protected Draw draw;

    public Shape(Draw draw) {
        this.draw = draw;
    }
    protected abstract void draw();
}
