package org.example.Class11_StringClass;

public class Task_2 {
    public static void main(String[] args) {

        /*
        count how many times the letter t has appeared in the string
        */
        String str="Matt is going to regret soon";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 't'||str.charAt(i)=='T') {
                    count++;
            }
        }
        System.out.println(count);



    }//end of main

}//end of class
