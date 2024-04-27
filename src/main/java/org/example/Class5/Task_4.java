package org.example.Class5;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you have a credit card? ");
        String hasCreditCard = scanner.nextLine().toLowerCase();

        if (hasCreditCard.equals("yes")) {
            System.out.print("What is the balance on your credit card? $");
            double balance = scanner.nextDouble();

            if (balance > 1000) {
                System.out.println("Pay it off immediately.");
            } else {
                System.out.println("You can spend more with your credit card.");
            }
        } else{
            System.out.println("Would you like to apply for one?");
        }
    }//end of main

}//end of class
