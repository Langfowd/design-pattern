package com.ltf.design.pattern.mediator;

public class Seller extends AbstractPerson {
    public Seller(Mediator mediator) {
        super(mediator);
    }

    @Override
    protected void getNotice(String msg) {
        System.out.println("我是卖家  接受到了消息："+msg);
    }

    @Override
    protected void notice(String msg) {
        mediator.sendMsg(msg,this);
    }
}
