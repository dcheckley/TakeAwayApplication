package com.company;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;

public class CsvLoader {

    public static Menu load() throws IOException {

        String path = "/Users/danielcheckley/Documents/dev-env/menu.csv";
        String line = "";
        ArrayList<MenuItem> fullMenu = new ArrayList<>();

            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) !=null) {
                String[] values = line.split(",");
                MenuItem mi = createMenuItem(values);
                fullMenu.add(mi);
            }
        br.close();

        Menu m = new Menu(fullMenu);


        return m;
    }

    public static MenuItem createMenuItem(String[] values) {

        int itemNumber = Integer.parseInt(values[0]);
        String name = values[1];
        BigDecimal price = new BigDecimal(values[2]);
        MenuItem m = new MenuItem(itemNumber, name, price);
        ArrayList<MenuItem> fullMenu = new ArrayList<>();
        fullMenu.add(m);

        return new MenuItem(itemNumber, name, price);
    }

}
