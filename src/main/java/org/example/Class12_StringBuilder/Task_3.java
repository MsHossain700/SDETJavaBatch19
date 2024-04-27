package org.example.Class12_StringBuilder;

public class Task_3 {

    /*
    Create a method that will take 2 parameters as numbers and print
    which number is larger
     */
    void maxNum (int num1, int num2){
        if(num1>num2){
            System.out.println(num1 + " is larger");
        } else if (num2>num1) {
            System.out.println(num2 + " is larger");
        } else {
            System.out.println("They are equal");
        }
    }

}//end of class
