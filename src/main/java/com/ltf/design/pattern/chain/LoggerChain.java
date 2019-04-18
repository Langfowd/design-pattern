package com.ltf.design.pattern.chain;

import java.util.ArrayList;
import java.util.List;

public class LoggerChain implements Logger {
    private List<Logger> list = new ArrayList<Logger>();
    private int index = 0;

    @Override
    public void write(int level,Logger base) {
        if (index == list.size()) {
            return;
        }
        Logger logger = list.get(index);
        index++;
        logger.write(level,base);
    }

    public LoggerChain addLogger(Logger logger) {
        list.add(logger);
        return this;
    }

}
