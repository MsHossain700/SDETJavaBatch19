package org.example.Class15_AccessModifiers;

public class Cat_Constructor {

    String name;
    String color;
    int age;

    //name of the constructor has to be the same as class
    Cat_Constructor(String cName, String cColor, int cAge){
        name = cName;
        color = cColor;
        age = cAge;

    }


    void printInfo(){
        System.out.println(name+ " " +color+ " "+age);
    }

}//end of class
