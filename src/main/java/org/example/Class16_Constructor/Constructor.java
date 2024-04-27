package org.example.Class16_Constructor;

public class Constructor {
    /*
    Write java class that have 4 constructors with 4 different access levels
    of constructors (private, public, default, protected) and create 4
    objects of this class: 1- inside same class; 2-from outside class;
    3- from different package and observe result.
     */

    private Constructor(){
        System.out.println("Private");
    }

    public Constructor(String s){
        System.out.println(s);
    }

    Constructor(int a){
        System.out.println(a);
    }

    protected Constructor (char b){
        System.out.println(b);
    }

    public static void main(String[] args) {
        new Constructor();
    }




}//end of class
