package org.example.Class19_Method_Overloading;
/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo,
HP, Dell.
Define common behavior within and some fields in parent class and
override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array.
Loop through each object and execute available methods.

 */
public class Computer {
    void Screen(){
        System.out.println("All computers have screens");
    }
    void Power(){
        System.out.println("All computers require power to operate");
    }
    void Devices(){
        System.out.println("All computers have multiple Devices");
    }


}

class Apple extends Computer{
    @Override
    void Screen(){
        System.out.println("Apple computers have high-resolution Retina displays");
    }

}

class Lenovo extends Computer{
    @Override
    void Devices(){
        System.out.println("Lenovo computers may come with additional accessories");
    }
}

class HP extends Computer{
    @Override
    void Power() {
        System.out.println("HP computers have energy-saving features");
    }
}

class Dell extends Computer{
    @Override
    void Power() {
        System.out.println("Dell computers have efficient power management systems");
    }

}


