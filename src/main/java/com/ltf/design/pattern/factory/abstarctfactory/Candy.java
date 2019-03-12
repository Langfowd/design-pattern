package com.ltf.design.pattern.factory.abstarctfactory;

import lombok.Data;

@Data
public class Candy {
    private String name;
    private int price;

    public Candy(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
