package com.ltf.design.pattern.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Monitor monitor = new Monitor(new XiaoHua());
        monitor.oneDay();
        System.out.println("==================");
        Monitor monitor1 = new Monitor(new XiaoMing());
        monitor1.oneDay();
    }
}
