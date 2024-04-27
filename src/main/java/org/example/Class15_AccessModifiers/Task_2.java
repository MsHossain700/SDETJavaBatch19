package org.example.Class15_AccessModifiers;

public class Task_2 {
    /*
    Create a method that will take string as a parameter and returns reverse
    String. Method should be available to all classes within your project
    and accessible by class name.
     */

    public String strExample="This is the example";

    public String reverseString() {
        StringBuilder strExampleReversed = new StringBuilder(strExample);
        return strExampleReversed.reverse().toString();
    }


}//end of class
