package org.example.Class13_Methods;

public class Task_2 {
    /*
    Write a method to return whether given number is prime or not

    */
    boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }else if (num==2 || num==3){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}//end of class
