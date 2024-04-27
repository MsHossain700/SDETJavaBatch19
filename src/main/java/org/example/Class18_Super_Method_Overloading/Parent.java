package org.example.Class18_Super_Method_Overloading;

public class Parent {
    String name="Jack";

}

class child extends Parent{
    String name="Tara";

    void printNames(){
        String name="Sam";
        System.out.println(name);// Local variable
        System.out.println(this.name); // Instance variable of the Child class
        System.out.println(super.name); // Instance variable of the Parent class
    }

}

class parentTester{
    public static void main(String[] args) {
        child c1 = new child();
        c1.printNames();
    }
}

