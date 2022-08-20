package com.company;
import java.util.Scanner;

public class UserInput {

    public static int usersNextInt() {

        Scanner s = new Scanner(System.in);
        System.out.println("Please type here:");

       return s.nextInt();
    }

    public static String usersNextString() {

        Scanner s = new Scanner(System.in);
        System.out.println("Please type here:");

        return s.nextLine();
    }

}
