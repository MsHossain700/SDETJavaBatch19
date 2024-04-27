package org.example.Class19_Method_Overloading;

public class Parent {


    void sorry(){
        System.out.println("Marry the girl we choose for you");

    }
}
class Alex extends Parent{

    void marry(){
        System.out.println("I want to marry Jason Momoa");
    }
}

class ParentTester{
    public static void main(String[] args) {
        Alex c = new Alex();
        c.marry();


    }
}