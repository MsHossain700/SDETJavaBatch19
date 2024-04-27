package org.example.Class15_AccessModifiers;

public class Task_3 {
    /*
       Create a method that will accept a string as a parameter and return a
       new string that consist ony of vowels. method should be available
       inside the class only where it was declared and executed by calling it
       is name.

     */

    private static String extractVowels(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static void main(String[] args) {
        Task_3 task = new Task_3();
        String originalString = "This is the example";
        String vowelsOnly = task.extractVowels(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Vowels Only: " + vowelsOnly);
    }


}//end of class
