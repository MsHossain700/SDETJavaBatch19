package org.example.Class16_Constructor;

public class Task_1 {
    /*
    Write a java class that will have a constructor: one with parameters
    and second without any parameters. Create a separate Test class where
    you will execute both of the constructors 1 by 1.
     */



    private String name;

    public   Task_1(){
        System.out.println("1");
    }

    public Task_1(String tName){

        name=tName;
        System.out.println("2");
    }


}//end of main
