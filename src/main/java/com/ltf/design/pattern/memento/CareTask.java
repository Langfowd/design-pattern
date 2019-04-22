package com.ltf.design.pattern.memento;

import java.util.LinkedList;

public class CareTask {
    private LinkedList<Memento> list = new LinkedList<Memento>();

    public void add(Memento memento) {
        list.addFirst(memento);
    }

    public Memento get(int index) {
        return list.get(index);
    }
}
