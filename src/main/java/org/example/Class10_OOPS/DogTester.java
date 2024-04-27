package org.example.Class10_OOPS;

public class DogTester {
    public static void main(String[] args) {
        /*
        we have created a variable dogObject1 which has a data type Dog
        We are creating the object of Dog, and we are storing it in
        dogObject1 variable.
         */
        Dog dogObject1=new Dog();
        dogObject1.name="Jimmi";
        dogObject1.breed="German";
        dogObject1.color="Black";
        dogObject1.age=4;
        dogObject1.weight=20;
            System.out.println(dogObject1.name);
            System.out.println(dogObject1.breed);
            System.out.println(dogObject1.color);
            System.out.println(dogObject1.age);
        dogObject1.bark();

        Dog dog2=new Dog();
        dog2.name="Bob";
        dog2.color="White";
        dog2.breed="Bulldog";
        dog2.age=10;
        dog2.weight=15;
            System.out.println(dog2.name);
            System.out.println(dog2.color);
            System.out.println(dog2.breed);
            System.out.println(dog2.age);
        dog2.sleep();



    }//end of main
}//end of class
