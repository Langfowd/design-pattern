package com.ltf.design.pattern.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        DrawSquart squart = new DrawSquart();
        squart.draw();

        DrawCirCle cirCle = new DrawCirCle();
        cirCle.draw();

        DrawDecorator decorator = new DrawRedDecorator(squart);
        decorator.draw();

        DrawDecorator decorator2 = new DrawRedDecorator(cirCle);
        decorator2.draw();
    }
}
