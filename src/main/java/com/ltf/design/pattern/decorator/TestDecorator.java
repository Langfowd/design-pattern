package com.ltf.design.pattern.decorator;

public class TestDecorator {
    public static void main(String[] args) {
        DrawSquare squart = new DrawSquare();
        squart.draw();

        DrawCirCle cirCle = new DrawCirCle();
        cirCle.draw();

        DrawDecorator decorator = new DrawRedDecorator(squart);
        decorator.draw();

        DrawDecorator decorator2 = new DrawRedDecorator(cirCle);
        decorator2.draw();
    }
}
