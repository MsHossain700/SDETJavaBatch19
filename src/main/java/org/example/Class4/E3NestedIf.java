package org.example.Class4;

public class E3NestedIf {
    public static void main(String[] args) {

        boolean mainDoor = true;
        boolean room1 = false;
        boolean room2 = false;

        if (mainDoor) {

            if (room1) {
                System.out.println("Room 1");
            } else {
                System.out.println("Room 1 is closed");
            }
        } else {
            System.out.println("Main door is closed");
        }

        }//end of if else

    }//end of main

