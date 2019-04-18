package com.ltf.design.pattern.proxy.staticProxy;

import com.ltf.design.pattern.proxy.Person;
import com.ltf.design.pattern.proxy.XiaoMing;

public class TestProxy {
    public static void main(String[] args) {
        Person xiaoming = new Proxy(new XiaoMing());
        xiaoming.marry();
    }
}
