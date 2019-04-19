package com.ltf.design.pattern.command;

/**
 * 恢复
 */
public class Redo implements Executor {

    private Command command;

    public Redo(Command command) {
        this.command = command;
    }

    @Override
    public void execute() {
        command.redo();
    }
}
