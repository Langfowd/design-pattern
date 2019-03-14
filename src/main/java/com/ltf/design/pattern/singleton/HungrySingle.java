package com.ltf.design.pattern.singleton;

/**
 * 饿汉式单例
 */
public class HungrySingle {
    private static final HungrySingle SINGLE = new HungrySingle();
    private HungrySingle() {}

    public static HungrySingle getInstance() {
        return SINGLE;
    }
    // 防止序列化破坏单例
    public Object readResolve() {
        return SINGLE;
    }
}
