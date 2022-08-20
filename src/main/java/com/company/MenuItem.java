package com.company;

import java.math.BigDecimal;

public class MenuItem {

    private int itemNumber;
    private String name;
    private BigDecimal price;


    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public MenuItem(int itemNumber, String name, BigDecimal price) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.price = price;
    }

}
