package com.ltf.design.pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 登记注册式单例
 */
public class RegisteredSingle {
    private static final Map<String,Object> map = new ConcurrentHashMap<String, Object>();

    private RegisteredSingle(){}

    public static Object getBean(Class clazz) {
        if (clazz == null) {
            throw new NullPointerException("args not null");
        }
        String name = clazz.getName();
        if (map.containsKey(name)) {
            return  map.get(name);
        } else {
            try {
                synchronized (map) {
                    if (!map.containsKey(name)) {
                        map.put(name,clazz.newInstance());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }
}
