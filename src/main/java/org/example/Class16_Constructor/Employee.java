package org.example.Class16_Constructor;

public class Employee {

    private String name;
    private String id;
    private int age;
    private double salary;

    public Employee(String E1name, String E1id, int age){
        name=E1name;
        id=E1id;
        if (age<150){
            age=age;
        }else {
            System.out.println("Not Allowed");
        }


    }

    public Employee(String E1name, String E1id, int E1age, double E1salary){
        name=E1name;
        id=E1id;
        if (E1age<150){
            age=E1age;
        }else {
            System.out.println("Not Allowed");
        }
        salary = E1salary;

    }
        void printInfo(){
            System.out.println(name+ " " + id + " " + age + " " + salary);
        }




}//end of class
