package com.ltf.design.pattern.mediator;

public class Buyer extends AbstractPerson {

    public Buyer(Mediator mediator) {
        super(mediator);
    }

    @Override
    protected void getNotice(String msg) {
        System.out.println("我是买家  接受到了消息："+msg);
    }

    @Override
    protected void notice(String msg) {
        mediator.sendMsg(msg,this);
    }
}
