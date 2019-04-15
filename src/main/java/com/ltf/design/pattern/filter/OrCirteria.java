package com.ltf.design.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class OrCirteria implements Criteria {
    private Criteria criteria;
    private Criteria andCriteria;

    public OrCirteria(Criteria criteria, Criteria andCriteria) {
        this.criteria = criteria;
        this.andCriteria = andCriteria;
    }

    @Override
    public List<Person> filterList(List<Person> list) {
        List<Person> people = criteria.filterList(list);
        List<Person> all = andCriteria.filterList(people);
        List<Person> result = new ArrayList<Person>();
        for (Person person : all) {
            if (!result.contains(person)) {
                result.add(person);
            }
        }
        return result;
    }

}
