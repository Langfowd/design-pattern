package com.ltf.design.pattern.proxy.dynamic.jdkproxy;

import com.ltf.design.pattern.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {
    private Person person;

    public Person getProxy(Person person) {
        this.person = person;
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),person.getClass().getInterfaces(),
                this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这是个Jdk高富帅");
        return method.invoke(person,args);
    }
}
