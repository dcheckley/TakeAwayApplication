package com.company;

import java.util.ArrayList;
import java.util.Optional;

public class Menu {

    private ArrayList<MenuItem> items;

    public ArrayList<MenuItem> getItems() {

        return items;
    }

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;

    }

    public void print() {

        System.out.println("------------------------------------");

        for (MenuItem item : items) {
            System.out.println(item.getItemNumber() + " " + item.getName() + " " + item.getPrice());
        }

        System.out.println("------------------------------------");

    }

    public Optional<MenuItem> findMenuItem(int mi) {

        for (MenuItem item : items) {

            if (item.getItemNumber() == mi) {
                return Optional.of(item);
            }
        }

        return Optional.empty();
    }

}
