package org.example.Class11_StringClass;

public class Task_3 {
    public static void main(String[] args) {

        /*
        Create a String and if the String is not empty perform the
        following:
        if the String has an odd number of characters and has 3 or
        more characters, print the character in the middle of the
        String
        For Example String str = "hello"
         */

        String str="Hello";


        if (!str.isEmpty()) {
            if (str.length() % 2 != 0 && str.length()>=3) {
                int middleIndex = str.length()/2;
                char middleCharacter = str.charAt(middleIndex);
                System.out.println(middleCharacter);
            }else {
                System.out.println("The string does not meet the conditions.");
            }
        }else {
            System.out.println("The string is empty.");
        }
        System.out.println(str.length());

    }//end of main
}//end of class
