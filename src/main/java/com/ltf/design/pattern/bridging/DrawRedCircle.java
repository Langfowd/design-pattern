package com.ltf.design.pattern.bridging;

/**
 * 画红色圆圈
 */
public class DrawRedCircle implements Draw {

    @Override
    public void draw() {
        System.out.println("画了个红色圈圈");
    }
}