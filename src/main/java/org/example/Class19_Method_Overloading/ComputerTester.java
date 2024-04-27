package org.example.Class19_Method_Overloading;

public class ComputerTester {
    public static void main(String[] args) {

        Computer [] arr = {new Apple(),new Lenovo(),new HP(),new Dell()};

        for ( int i = 0; i < arr.length; i++){
            Computer C =arr [i];
            C.Screen();
            C.Devices();
            C.Power();


        }

    }
}

