package com.ltf.design.pattern.proxy.staticProxy;

import com.ltf.design.pattern.proxy.Person;

public class Proxy implements Person {
    private Person person;

    public Proxy(Person person) {
        this.person = person;
    }

    @Override
    public void marry() {
        System.out.println("这是个高富帅");
        person.marry();

    }

    @Override
    public String sayName(String name) {
        System.out.println(name);
        return "SUCCESS " + name;
    }
}
