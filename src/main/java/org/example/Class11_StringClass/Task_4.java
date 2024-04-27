package org.example.Class11_StringClass;

public class Task_4 {
    public static void main(String[] args) {

        //print the string in reverse

        String str="Sunday";

        for (int i=str.length()-1; i >=0; i--){
            System.out.print(str.charAt(i));
        }
        /*
        This loop iterates through the characters of the string str in
        reverse order, starting from the last character
        (at index str.length() - 1) and ending at the first character
        (at index 0). For each iteration, it prints the character at
        the current index using str.charAt(i). Therefore, the output
        of this code will be the string "yadnuS", which is "Sunday"
        printed in reverse.
         */

    }//end of main
}//end of class
