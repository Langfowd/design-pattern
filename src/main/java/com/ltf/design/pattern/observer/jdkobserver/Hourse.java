package com.ltf.design.pattern.observer.jdkobserver;

import java.util.Observable;

public class Hourse extends Observable {

    public void chagePrice(int price) {
        System.out.println("房屋价格信息变更了 price : "+price);
        setChanged();
        notifyObservers(price);
    }
}
