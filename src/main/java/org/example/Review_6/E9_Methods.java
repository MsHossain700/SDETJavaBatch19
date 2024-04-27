package org.example.Review_6;

public class E9_Methods {
    /*
    Create a method which will take a number as input and it is going to
    print all the numbers starting from 0 until that number.
     */

    void printNumber (int num){
        for (int i = 0;i <= num; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        E9_Methods e=new E9_Methods();
        e.printNumber(5);
    }
}//end of class
