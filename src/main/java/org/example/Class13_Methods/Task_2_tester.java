package org.example.Class13_Methods;

import java.util.Scanner;

public class Task_2_tester {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Task_2 T2 = new Task_2();

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        boolean isPrime = T2.isPrime(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();

    }//end of main
}//end of class

