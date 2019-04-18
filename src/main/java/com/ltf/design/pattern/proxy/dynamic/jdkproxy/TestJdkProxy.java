package com.ltf.design.pattern.proxy.dynamic.jdkproxy;

import com.ltf.design.pattern.proxy.Person;
import com.ltf.design.pattern.proxy.XiaoMing;

public class TestJdkProxy {
    public static void main(String[] args) {
        Person proxy = new JdkProxy().getProxy(new XiaoMing());
        proxy.marry();
    }
}
