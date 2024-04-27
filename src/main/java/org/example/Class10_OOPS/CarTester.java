package org.example.Class10_OOPS;

public class CarTester {
    public static void main(String[] args) {

        Car toyotaCar = new Car();
        toyotaCar.make="Toyota";
        toyotaCar.model="Prius";
        toyotaCar.year=2024;
        toyotaCar.color="Red";
        toyotaCar.price=50000;
        System.out.println(toyotaCar.make);
        System.out.println(toyotaCar.model);
        System.out.println(toyotaCar.year);
        System.out.println(toyotaCar.color);
        System.out.println(toyotaCar.price);
        toyotaCar.moveForward();
        toyotaCar.applyBrakes();

        Car bmwCar = new Car();
        bmwCar.make="BMW";
        bmwCar.model="M550i";
        bmwCar.year=2022;
        bmwCar.color="Blue";
        bmwCar.price=55000;
        System.out.println(bmwCar.make);
        System.out.println(bmwCar.model);
        System.out.println(bmwCar.year);
        System.out.println(bmwCar.color);
        System.out.println(bmwCar.price);
        bmwCar.moveForward();
        bmwCar.applyBrakes();


    }//end of main
}//end of class

