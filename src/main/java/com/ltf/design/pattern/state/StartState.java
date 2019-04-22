package com.ltf.design.pattern.state;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("开始");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
