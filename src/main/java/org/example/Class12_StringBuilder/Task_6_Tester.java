package org.example.Class12_StringBuilder;

import java.util.Scanner;

public class Task_6_Tester {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the name of a country: ");
        String country=scan.next();
        Task_6 T6= new Task_6();

        T6.sayHello(country);


    }//end of main
}//end of class
