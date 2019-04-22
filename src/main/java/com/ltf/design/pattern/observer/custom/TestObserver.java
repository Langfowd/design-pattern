package com.ltf.design.pattern.observer.custom;

public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new XiaoHua());
        subject.addObserver(new XiaoMing());
        Observer observer = new Hourse(subject);
        observer.update(10);
    }
}
