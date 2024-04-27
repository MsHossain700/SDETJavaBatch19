package org.example.Class15_AccessModifiers;

public class Task_1 {
    /*
    Create a method that will accept an array as parameters and will return
    a sum of all elements from that array. Method should be visible only
    within same package and accessible by creating an instance/object of
    the class.
     */


    int sumArray(int[] array) {

        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Task_1 T1 = new Task_1();
        int[] ages = {10, 15, 60, 45, 23, 90};
        int totalSum = T1.sumArray(ages);
        System.out.println(totalSum);




    }//end of class
}//end of main
