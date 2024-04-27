package org.example.Class13_Methods;

import org.example.Class15_AccessModifiers.Dog;

public class DogTester2 {
    public static void main(String[] args) {
        Dog d= new Dog();
        //d.name ="dogExample";
        /*
        d.name is red because Dog name in Class15 isn't public but default.
        cannot access that in a different package
        */
    }
}
