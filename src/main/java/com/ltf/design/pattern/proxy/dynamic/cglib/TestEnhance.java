package com.ltf.design.pattern.proxy.dynamic.cglib;

import com.ltf.design.pattern.proxy.XiaoMing;

public class TestEnhance {
    public static void main(String[] args) {
        XiaoMing instance = (XiaoMing) new EnhanceProxy().getInstance(new XiaoMing());
        instance.marry();
    }
}
