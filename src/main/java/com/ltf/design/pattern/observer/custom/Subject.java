package com.ltf.design.pattern.observer.custom;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> list = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        list.add(observer);
    }

    public void noticeAll(final int price) {
        list.forEach(s -> s.update(price));
    }
}
