package com.ltf.design.pattern.observer.custom;

public class Hourse implements Observer{
    protected Subject subject;

    public Hourse(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(int price) {
        System.out.println("房屋价格变更了 price:"+price);
        subject.noticeAll(price);
    }
}
