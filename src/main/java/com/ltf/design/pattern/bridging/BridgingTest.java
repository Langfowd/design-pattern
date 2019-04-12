package com.ltf.design.pattern.bridging;

public class BridgingTest {
    public static void main(String[] args) {
        Shape shape = new Circle(new DrawGreenCircle());
        shape.draw();
        System.out.println("=========");
        Shape red = new Circle(new DrawRedCircle());
        red.draw();
    }
}
