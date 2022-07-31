package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Order {

    private ArrayList<MenuItem> orderedItem;

    public Order() {
        this.orderedItem = new ArrayList<>();
    }

    public void addItem(MenuItem mi) {

        orderedItem.add(mi);

    }

    public void print() {

        for (MenuItem item : orderedItem) {
            System.out.println(item.getItemNumber() + " " + item.getName() + " " + item.getPrice());
        }

    }

    public BigDecimal totalOfOrder() {

        BigDecimal total = new BigDecimal(0);

        for (MenuItem item : orderedItem) {
            total = total.add(item.getPrice());
        }


        return total;
    }

}
