package org.example.Class5;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your birth month: ");
        String month = scan.nextLine().toLowerCase();
        switch (month) {
            case ("march"):
            case ("april"):
            case ("may"):
                System.out.println("You were born in the Spring");
                break;
            case ("june"):
            case ("july"):
            case ("august"):
                System.out.println("You were born in the Summer");
                break;
            case ("september"):
            case ("october"):
            case ("november"):
                System.out.println("You were born in the Fall");
                break;
            case ("december"):
            case ("january"):
            case ("february"):
                System.out.println("You were born in the Winter");
                break;
            default:
                System.out.println("Invalid input");
        }

    }//end of main

}//end of class
