package com.ltf.design.pattern.decorator;

/**
 * 装饰类
 */
public class DrawDecorator implements Draw{
    private Draw draw;

    public DrawDecorator(Draw draw) {
        this.draw = draw;
    }


    @Override
    public void draw() {
        draw.draw();
    }
}
