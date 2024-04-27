package org.example.Class15_AccessModifiers;

public class Task_2_Tester {
    public static void main(String[] args) {

        /*
    Create a method that will take string as a parameter and returns reverse
    String. Method should be available to all classes within your project
    and accessible by class name.
     */

        Task_2 T2 = new Task_2();
        String strExampleReversed = T2.reverseString();
        System.out.println(strExampleReversed);


    }//end of main
}//end of class
