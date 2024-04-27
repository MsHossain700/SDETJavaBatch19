package org.example.Class5;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the city: ");
        String city = scanner.nextLine();
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature in the city " + city + " is " + celsius + " degrees Celsius.");



    }//end of main

}//end of class
