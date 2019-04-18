package com.ltf.design.pattern.chain;

public class DebugLogger extends LoggerChain {

    @Override
    public void write(int level,Logger base) {
        if (level == 1) {
            System.out.println("logger : debug");
            return;
        }
        base.write(level,base);
    }
}
