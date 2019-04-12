package com.ltf.design.pattern.bridging;

/**
 * 画绿色圆圈
 */
public class DrawGreenCircle implements Draw {

    @Override
    public void draw() {
        System.out.println("画了个绿色圈圈");
    }
}