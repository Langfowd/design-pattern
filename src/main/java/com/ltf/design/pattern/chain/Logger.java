package com.ltf.design.pattern.chain;

public interface Logger {
    void write(int level,Logger base);
}
