package org.example.Class5;

public class E9_LogicalOR {
    public static void main(String[] args) {

        /*
        Returns true if at least one of the boolean expressions
        is true; otherwise, it returns false.
         */
        double bankBalance=20000;
        double cash= 40000;

        if (bankBalance>30000 || cash>30000){
            System.out.println("I can go buy a toyota corolla");
        }else{
            System.out.println("I need to save more");
        }

    }
}
