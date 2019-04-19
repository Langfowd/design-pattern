package com.ltf.design.pattern.mediator;

/**
 * 中介对象接口
 *
 */
public interface Mediator {
    void sendMsg(String msg,AbstractPerson person);
}
