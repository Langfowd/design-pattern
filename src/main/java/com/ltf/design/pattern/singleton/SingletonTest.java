package com.ltf.design.pattern.singleton;

import java.util.concurrent.CountDownLatch;

public class SingletonTest {
    public static void main(String[] args) {
        final int count = 20;
        CountDownLatch latch = new CountDownLatch(count);
        EnumSingle.SINGLE.setData(new Object());
        for (int i = 0; i < count; i++) {
            new Thread(()->{
                try {
                    latch.await();
                    // 测试饿汉式
                    // System.out.println(Thread.currentThread().getName()+":"+HungrySingle.getInstance());
                    // 测试懒汉式
                    // System.out.println(Thread.currentThread().getName()+":"+LazySingle.getInstance());
                    // 测试双重检索
                    // System.out.println(Thread.currentThread().getName()+":"+DoubleCheckSingle.getInstance());
                    // 测试内部类
                    // System.out.println(Thread.currentThread().getName()+":"+ClassInnerSingle.getInstance());
                    // 测试枚举式

                     System.out.println(Thread.currentThread().getName()+":"+EnumSingle.SINGLE.getData());
                    // 测试注册式单例
                    // System.out.println(Thread.currentThread().getName()+":"+RegisteredSingle.getBean(RegisteredSingle.class));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },"thread:"+i).start();
            latch.countDown();
        }

    }
}
