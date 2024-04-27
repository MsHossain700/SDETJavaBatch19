package org.example.Class5;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for day: ");
        int dayNumber = scanner.nextInt();

        if (dayNumber <= 5) {
            System.out.println("It is a weekday.");
        } else if (dayNumber >5  && dayNumber <= 7) {
            System.out.println("It is a weekend.");
        } else {
            System.out.println("Invalid day.");
        }

    }//end of main

}//end of class
