package org.example.Class15_AccessModifiers;

public class Task_3_AsgharsWay {
    /*
       Create a method that will accept a string as a parameter and return a
       new string that consist ony of vowels. method should be available
       inside the class only where it was declared and executed by calling it
       is name.
     */

    private static String getVowels(String str){
        return str.replaceAll("[^aeiouAEIOU]","");
    }

    public static void main(String[] args) {
        System.out.println(getVowels("This is the example"));

    }


}//end of class
