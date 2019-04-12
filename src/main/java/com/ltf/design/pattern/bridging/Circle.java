package com.ltf.design.pattern.bridging;

public class Circle extends Shape {

    public Circle(Draw draw) {
        super(draw);
    }

    @Override
    protected void draw() {
        draw.draw();
    }
}
