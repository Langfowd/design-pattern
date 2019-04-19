package com.ltf.design.pattern.command;

/**
 * 请求封装对象
 */
public class Command {

    public void undo() {
        System.out.println("undo ``````");
    }

    public void redo() {
        System.out.println("redo ``````");
    }

}
