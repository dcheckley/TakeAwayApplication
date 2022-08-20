package com.company;

import java.io.IOException;

public class Welcome {

    public static void welcomeMessage() throws IOException {

        System.out.println("Hello, welcome to the takeaway application.\n");
        CommandMenu.showCommands();

    }

    public String justATest() {

        return "hello";
    }

}
