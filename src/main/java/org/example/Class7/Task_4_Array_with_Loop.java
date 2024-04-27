package org.example.Class7;

public class Task_4_Array_with_Loop {
    public static void main(String[] args) {

        String [] cars={"corvette","camaro","camry","corolla","accord","civic"};

        //using for loop to print the array
        for (int i=0;i<6;i++){
            System.out.println(cars[i]);

        }//end of for loop

        //using while loop to print the array
        int i=0;
        while (i<6){
            System.out.println(cars[i]);
            i++;
        }//end of while loop

    }//end fo main

}//end of class
