package com.ltf.design.pattern.singleton;

import java.io.Serializable;

/**
 * 懒汉式
 */
public class LazySingle implements Serializable {
    private static LazySingle single;
    private LazySingle(){}

    public synchronized static LazySingle getInstance() {
        if (single == null) {
            single = new LazySingle();
        }
        return single;
    }

    // 防止序列化破坏单例
    public Object readResolve() {
        return single;
    }
}
