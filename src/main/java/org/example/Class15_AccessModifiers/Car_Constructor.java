package org.example.Class15_AccessModifiers;

public class Car_Constructor {

    String make;

    String model;
    String color;
    int year;

    Car_Constructor(String carMake, String carModel, String carColor, int carYear){

        make = carMake;
        model= carModel;
        color = carColor;
        year = carYear;

    }


    void printInfo(){
        System.out.println(make+ " " +model+ " "+color+ " "+year);
    }
}//end of class
