package org.example.Class17_Inheritance;

public class E {

    /*
    Write program to inherit class E that has method printF which is
    static and call or reuse that method into class
     */

    static void printF(){
        System.out.println("PrintF");
    }

}

    class F extends E{

}

    class Tester {
        public static void main(String[] args) {

        F F1 = new F();
        F1.printF();


    }
}
