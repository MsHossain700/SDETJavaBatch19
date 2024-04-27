package org.example.Class17_Inheritance;

public class Animal_Tester {
    public static void main(String[] args) {

        Cat C1=new Cat();

        C1.name="Lulu";
        C1.age=2;
        C1.color="Brown";
        C1.weight=10;

        C1.speak();
        C1.sleep();
        C1.printInfo();

        System.out.println();


        Dog D1=new Dog();
        D1.name="Roscoe";
        D1.age=5;
        D1.color="White";
        D1.weight=25;

        D1.bark();
        D1.sleep();
        D1.printInfo();



    }//end of main
}//end of class
