package org.example.Class18_Super_Method_Overloading;


public class Animal {
    private String name;
    private String color;
    private  int age;
    private double weight;

    public Animal(String name){
        this.name=name;
    }

    public Animal(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}

class Dog extends Animal{
    Dog(String name, String color, int age, double weight){
        super (name, color, age, weight);

    }
}

class AnimalTester{
    public static void main(String[] args) {
        Dog d=new Dog("Jackie","Black",10,20);
        d.printInfo();
    }
}
