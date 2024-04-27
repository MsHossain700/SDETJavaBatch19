package org.example.Class15_AccessModifiers;

public class Task_2_AsgharWay {
    /*
    Create a method that will take string as a parameter and returns reverse
    String. Method should be available to all classes within your project
    and accessible by class name.
     */

    public static String reverseString(String strExample) {

        return new StringBuilder(strExample).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(Task_2_AsgharWay.reverseString("This is the example"));
    }

}
