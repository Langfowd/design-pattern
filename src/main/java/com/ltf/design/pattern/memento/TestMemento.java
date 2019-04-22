package com.ltf.design.pattern.memento;

public class TestMemento {
    public static void main(String[] args) {
        CareTask task = new CareTask();
       MementoManager manager = new MementoManager();
        manager.setState("1");
        manager.setState("2");
        task.add(manager.saveStateToMemento());
        manager.setState("3");
        task.add(manager.saveStateToMemento());
        manager.setState("4");
        task.add(manager.saveStateToMemento());

        System.out.println(manager.getStateFromMemento(task.get(0)));
        System.out.println(manager.getStateFromMemento(task.get(1)));
        System.out.println(manager.getStateFromMemento(task.get(2)));

    }
}
