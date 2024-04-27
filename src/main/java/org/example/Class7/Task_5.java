package org.example.Class7;

public class Task_5 {
    public static void main(String[] args) {

        String [] animals={"lion","tiger","monkey","gazelle","deer",};

        //using for loop to print the array
        for (int i=0;i<5;i++){
            System.out.println(animals[i]);

        }//end of for loop

        //using while loop to print the array
        int i=0;
        while (i<5){
            System.out.println(animals[i]);
            i++;
        }//end of while loop

        //Enhanced for loop
        for (String n:animals){
            System.out.println(n);

        }
    }//end of main

}//end of class
