package com.ltf.design.pattern.filter;

import java.util.List;

/**
 * 过滤标准接口
 */
public interface Criteria {
    List<Person> filterList(List<Person> list);
}
