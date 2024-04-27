package org.example.Class4;

public class task7NestedIfElse {
    public static void main(String[] args) {

        int num1=5;
        int num2=9;
        int num3=99;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Largest number: " + num1);
            } else {
                System.out.println("Largest number: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("Largest number: " + num2);
            } else {
                System.out.println("Largest number: " + num3);
            }
        }
    }//end of main

}//end of class
