package org.example.Class22_OOPS_Review;

import java.util.Scanner;

/*
Write a function to count the number of words in a given. words are
separated by spaces or punctuations.
For example, the input "Hello, world!" should return 2.
 */
public class Task_3 {

    static int countWord(String str){
        return str.split("[,.?\\s]").length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide a sentence: ");
        String input = scanner.nextLine();

        int wordCount = countWord(input);
        System.out.println("Number of words: " + wordCount);

    }//end of main
}//end of class
    
   