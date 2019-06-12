package com.ltf.design.pattern.proxy;

public class XiaoMing implements Person{

    @Override
    public void marry() {
        System.out.println("名字:小明 年龄:20  找对象");
    }

    @Override
    public String sayName(String name) {
        System.out.println(name);
        return "SUCCESS "+name;
    }
}
