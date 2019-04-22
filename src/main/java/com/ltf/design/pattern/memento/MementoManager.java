package com.ltf.design.pattern.memento;

public class MementoManager {
    private String state;


    public void setState(String state) {
        this.state = state;
    }

    public String getStateFromMemento(Memento memento) {
        return memento.getState();
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

}
