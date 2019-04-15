package com.ltf.design.pattern.decorator;

public class DrawRedDecorator extends DrawDecorator {

    public DrawRedDecorator(Draw draw) {
        super(draw);
    }

    @Override
    public void draw() {
        super.draw();
        setRedColor();
    }

    private void setRedColor() {
        System.out.println("颜色--> 红色");
    }
}
