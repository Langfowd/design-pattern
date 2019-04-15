package com.ltf.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class XiaoMingCriteria implements Criteria {

    @Override
    public List<Person> filterList(List<Person> list) {
        List<Person> result = new ArrayList<Person>();
        for (Person person : list) {
            if ("xiaoming".equals(person.getName())) {
                result.add(person);
            }
        }
        return result;
    }
}
