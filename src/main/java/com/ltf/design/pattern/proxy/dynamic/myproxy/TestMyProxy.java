package com.ltf.design.pattern.proxy.dynamic.myproxy;

import com.ltf.design.pattern.proxy.Person;
import com.ltf.design.pattern.proxy.XiaoMing;

public class TestMyProxy {
    public static void main(String[] args) {
        Person person = (Person) new MyProxyInit(new XiaoMing()).getProxyInstance();
        //person.marry();
        String xiaoluo = person.sayName("xiaoluo");
        System.out.println(xiaoluo);
    }
}
