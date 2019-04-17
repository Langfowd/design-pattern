package com.ltf.design.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ShapeFactory {
    private static final Map<String,Shape> MAP = new ConcurrentHashMap<String, Shape>();

    public static Shape getShape(String color) {
        Shape shape = MAP.get(color);
        if (shape == null) {
            shape = new Circle(color);
            MAP.put(color,shape);
        }
        return shape;
    }
}
