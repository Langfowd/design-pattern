package com.ltf.design.pattern.filter;

import java.util.List;

public class AndCirteria implements Criteria {
    private Criteria criteria;
    private Criteria andCriteria;

    public AndCirteria(Criteria criteria, Criteria andCriteria) {
        this.criteria = criteria;
        this.andCriteria = andCriteria;
    }

    @Override
    public List<Person> filterList(List<Person> list) {
        List<Person> people = criteria.filterList(list);
        return andCriteria.filterList(people);
    }

}
