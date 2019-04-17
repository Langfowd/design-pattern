package com.ltf.design.pattern.decorator;

public class DrawSquare implements Draw {
    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
