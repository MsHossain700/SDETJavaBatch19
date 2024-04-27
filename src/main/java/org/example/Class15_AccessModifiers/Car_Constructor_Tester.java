package org.example.Class15_AccessModifiers;

public class Car_Constructor_Tester {
    public static void main(String[] args) {

        Car_Constructor Car1 = new Car_Constructor("BMW","M550i","Blue",2021);
        Car1.printInfo();

        Car_Constructor Car2 = new Car_Constructor("Jaguar","F-Type","Red",2022);
        Car2.printInfo();

        Car_Constructor Car3 = new Car_Constructor("Chevrolet","Corvette Z06","Silver",2018);
        Car3.printInfo();

    }//end of main
}//end of class
