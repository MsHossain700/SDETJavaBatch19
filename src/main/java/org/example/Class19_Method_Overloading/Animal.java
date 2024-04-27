package org.example.Class19_Method_Overloading;

public class Animal {

    void sleep(){
        System.out.println("Animals sleep");
    }

    void eat(){
        System.out.println("Animals eat");
    }


}

class Dog extends Animal{
    @Override
    void sleep(){
        System.out.println("Dog like to sleep 6 to 8 hours");
    }
}

class AnimalTester {
    public static void main(String[] args) {

        Dog D = new Dog();
        D.sleep();
        D.eat();
    }
}
