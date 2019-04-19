package com.ltf.design.pattern.command;

public class TestCommand {
    public static void main(String[] args) {
        Command command = new Command();

        Broker broker = new Broker();
        broker.addExecutor(new Undo(command));
        broker.addExecutor(new Redo(command));
        broker.execute();
    }
}
