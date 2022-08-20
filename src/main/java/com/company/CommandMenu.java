package com.company;

import java.io.IOException;
import java.util.Optional;

public class CommandMenu {

    public static void showCommands() throws IOException {

        System.out.println("Press 1 to create an order.\n" +
                "Press 2 to view the menu.\n" +
                "Press 3 to exit.\n");
        CommandMenu.chooseCommand();
    }

    public static void chooseCommand() throws IOException {

        int command = UserInput.usersNextInt();

        while (command < 1 || command > 3) {
            System.out.println(command + " is not a valid option please pick again");
            chooseCommand();
        }


        Menu menu = CsvLoader.load();
        Order o = new Order();

        switch (command) {
            case 1:
                String answer = "";

                do {
                    System.out.println("Please tell me your order with item numbers ");
                    int myMenuNumber = UserInput.usersNextInt();
                    Optional<MenuItem> mi = menu.findMenuItem(myMenuNumber);
                    if (mi.isPresent()) {
                        o.addItem(mi.get());
                    } else
                        System.out.println(myMenuNumber + " does not exist");

                    System.out.println("If you would like to order another item please press y ");
                    answer = UserInput.usersNextString();
                } while (answer.equalsIgnoreCase("y"));

                o.print();
                System.out.println("Your order total is £" + o.totalOfOrder());
                break;
            case 2:
                System.out.println("Here is the menu ");
                menu.print();
                CommandMenu.showCommands();
                break;
            default:
                System.out.println("You have exited the application");
                break;
        }
    }
}
