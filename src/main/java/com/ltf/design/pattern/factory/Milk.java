package com.ltf.design.pattern.factory;

import lombok.Data;

/**
 * 牛奶
 */
@Data
public class Milk {

    private String name;
    private int price;

    public Milk(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
