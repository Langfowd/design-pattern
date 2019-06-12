package com.ltf.design.pattern.factory.abstarctfactory;

public class Candy {
    private String name;
    private int price;

    public Candy(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * Gets the value of name.
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the value of price.
     *
     * @return the value of price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the price.
     *
     * @param price price
     */
    public void setPrice(int price) {
        this.price = price;
    }
}
