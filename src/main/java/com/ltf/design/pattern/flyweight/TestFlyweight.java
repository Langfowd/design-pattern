package com.ltf.design.pattern.flyweight;

import java.util.Random;

public class TestFlyweight {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle shape = (Circle) ShapeFactory.getShape(randomColor());
            shape.setX(i);
            shape.setY(i*i);
            shape.draw();
            System.out.println(shape);
        }
    }

    public static String randomColor() {
        String[] colors = new String[]{"red","green","yellow"};
        return colors[new Random().nextInt(3)];
    }
}
