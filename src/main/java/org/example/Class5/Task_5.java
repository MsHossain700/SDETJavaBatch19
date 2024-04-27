package org.example.Class5;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of years you have worked: ");
        int yearsWorked = scanner.nextInt();

        System.out.print("Enter your annual salary: $");
        double annualSalary = scanner.nextDouble();

        if (yearsWorked >= 5) {
            System.out.println("You are eligible for a bonus");
            if (annualSalary > 50000) {
                System.out.println("Your bonus is $5000.");
            } else {
                System.out.println("You are eligible for a $3000 bonus.");
            }
        } else {
            System.out.println("You are not eligible for a bonus");
        }

    }//end of main

}//end of class
