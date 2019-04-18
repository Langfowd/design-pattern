package com.ltf.design.pattern.chain;

public class InfoLogger extends LoggerChain {


    @Override
    public void write(int level,Logger base) {
        if (level == 2) {
            System.out.println("logger : info");
            return;
        }
        base.write(level,base);
    }
}
