package com.ltf.design.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令执行者
 */
public class Broker {

    private List<Executor> executors = new ArrayList<Executor>();

    public void addExecutor(Executor executor) {
        executors.add(executor);
    }

    public void execute() {
        for (Executor executor : executors) {
            executor.execute();
        }
    }
}
