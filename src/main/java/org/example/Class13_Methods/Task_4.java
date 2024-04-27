package org.example.Class13_Methods;

public class Task_4 {
    /*
    Create a method which is going to take an array as input, and it's going
    to return the count of number which are grater than 10 in that array
     */

    int addArray(int[] arr) {
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 10) {
                    counter++;
                }
            }
            return counter;
        }

        public static void main(String[] args) {
            Task_4 t4 = new Task_4();
            int[] ar = {10, 20, 30, 5, 88, 99, 5};
            int result = t4.addArray(ar);
            System.out.println(result);
        }


}//end of class

