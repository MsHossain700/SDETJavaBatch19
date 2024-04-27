package org.example.Class12_StringBuilder;

public class Task_5 {

    /*
    Create a method that will print whether given String is palindrome
    or not
     */

    void isPalindrome (String originalStr){

        StringBuilder str = new StringBuilder(originalStr);
        str.reverse();
        String reversedStr=str.toString();

        if (originalStr.equals(reversedStr)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}//end of class
