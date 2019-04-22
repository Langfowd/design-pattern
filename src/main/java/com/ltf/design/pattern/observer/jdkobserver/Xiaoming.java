package com.ltf.design.pattern.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

public class Xiaoming implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("xiaoming 接收到了价格变更 price :"+arg);
    }
}
