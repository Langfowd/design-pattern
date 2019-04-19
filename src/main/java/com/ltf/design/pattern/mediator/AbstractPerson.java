package com.ltf.design.pattern.mediator;

/**
 * 抽象公有类
 */
public abstract class AbstractPerson {
    protected Mediator mediator;

    public AbstractPerson(Mediator mediator) {
        this.mediator = mediator;
    }
    protected abstract void getNotice(String msg);

    protected abstract void notice(String msg);
}
