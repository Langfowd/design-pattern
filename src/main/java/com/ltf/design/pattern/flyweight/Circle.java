package com.ltf.design.pattern.flyweight;

import lombok.Data;

public class Circle implements Shape {
    private String color;
    private int x;
    private int y;

    /**
     * Gets the value of x.
     *
     * @return the value of x
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x.
     *
     * @param x x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets the value of y.
     *
     * @return the value of y
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y.
     *
     * @param y y
     */
    public void setY(int y) {
        this.y = y;
    }

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(color + ", "+x+", "+y);
    }
}
