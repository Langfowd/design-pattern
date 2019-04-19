package com.ltf.design.pattern.command;

/**
 * 撤销
 */
public class Undo implements Executor{

    private Command command;

    public Undo(Command command) {
        this.command = command;
    }

    @Override
    public void execute() {
        command.undo();
    }
}
