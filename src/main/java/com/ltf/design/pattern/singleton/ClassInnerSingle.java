package com.ltf.design.pattern.singleton;

/**
 * 内部类单例
 */
public class ClassInnerSingle {
    private ClassInnerSingle(){}

    public static ClassInnerSingle getInstance() {
        return Inner.SINGLE;
    }
    private static class Inner{
        private static final ClassInnerSingle SINGLE = new ClassInnerSingle();
    }

    // 防止序列化破坏单例
    public Object readResolve() {
        return getInstance();
    }
}
