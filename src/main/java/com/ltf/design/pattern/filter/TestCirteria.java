package com.ltf.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class TestCirteria {
    public static void main(String[] args) {
        Person xiaoming = new Person();
        xiaoming.setName("xiaoming");
        xiaoming.setAge(20);
        Person xiaohua = new Person();
        xiaohua.setName("xiaohua");
        xiaohua.setAge(21);
        List<Person> list = new ArrayList<Person>();
        list.add(xiaohua);
        list.add(xiaoming);
        Criteria criteria = new XiaoMingCriteria();
        Criteria xiaoHuaCriteria = new XiaoHuaCriteria();
        Criteria andCirteria = new AndCirteria(criteria,xiaoHuaCriteria);
        List<Person> xm = criteria.filterList(list);
        System.out.println(xm);
        List<Person> xh = xiaoHuaCriteria.filterList(list);
        System.out.println(xh);
        List<Person> and = andCirteria.filterList(list);
        System.out.println(and);
    }
}
