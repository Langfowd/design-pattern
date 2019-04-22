package com.ltf.design.pattern.observer.jdkobserver;

public class TestObserver {
    public static void main(String[] args) {
        Hourse observable = new Hourse();
        observable.addObserver(new XiaoHua());
        observable.addObserver(new Xiaoming());
        observable.chagePrice(3);
    }
}
