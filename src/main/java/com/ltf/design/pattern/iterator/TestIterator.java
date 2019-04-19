package com.ltf.design.pattern.iterator;

public class TestIterator {
    public static void main(String[] args) {
        NamesContainer container = new NamesContainer();
        container.addName("小明");
        container.addName("小华");
        container.addName("小红");
        container.addName("小飞");
        for (Iterator iterator = container.getIterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
