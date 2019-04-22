package com.ltf.design.pattern.state;

public class EndState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("结束");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "end state";
    }
}
