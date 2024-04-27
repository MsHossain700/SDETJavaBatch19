package org.example.Class5;

public class E7_logicalNot {
    public static void main(String[] args) {
        /*  logical operators are used to perform logical operations
        on boolean values. These operators are typically employed
        in conditional statements and loops to make decisions based
        on multiple conditions.

        1)Logical AND (&&)
        2)Logical OR (||)
        3)Logical NOT (!)
        */
        String country = "North Korea";

        if (!country.equals("USA")) {
            System.out.println("Citizens of " + country + " are not allowed to enter the USA.");
        } else {
            System.out.println("Welcome to the USA!");
        }


    }//end of main

}//end of class
