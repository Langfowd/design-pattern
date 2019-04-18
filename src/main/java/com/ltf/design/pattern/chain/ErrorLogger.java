package com.ltf.design.pattern.chain;

public class ErrorLogger extends LoggerChain {

    @Override
    public void write(int level,Logger base) {
        if (level == 3) {
            System.err.println("logger : error");
            return;
        }
        base.write(level,base);
    }
}
