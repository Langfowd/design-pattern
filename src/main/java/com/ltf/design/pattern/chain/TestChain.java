package com.ltf.design.pattern.chain;

public class TestChain {
    public static void main(String[] args) {
        LoggerChain chain = new LoggerChain();
        chain.addLogger(new DebugLogger()).addLogger(new InfoLogger())
                .addLogger(new ErrorLogger());
        chain.write(2,chain);
    }
}
