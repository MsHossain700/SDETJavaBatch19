package org.example.Class15_AccessModifiers;

public class Dog {
    String name;

    int age;

    void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog D1= new Dog();
        D1.name="Jerry";
        D1.age=23;
        D1.printName();
    }
}
