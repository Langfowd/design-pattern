package com.ltf.design.pattern.singleton;

/**
 * 双重检索单例
 */
public class DoubleCheckSingle {
    // 需要volatile修饰，防止single = new DoubleCheckSingle() 指令重排照成的single为null
    private static volatile DoubleCheckSingle single;
    private DoubleCheckSingle(){}

    public static DoubleCheckSingle getInstance() {
        if (single == null) {
            synchronized (DoubleCheckSingle.class) {
                if (single == null) {
                    single = new DoubleCheckSingle();
                }
            }
        }
        return single;
    }

    // 防止序列化破坏单例
    public Object readResolve() {
        return single;
    }
}
