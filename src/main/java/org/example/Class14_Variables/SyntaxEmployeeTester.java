package org.example.Class14_Variables;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {

        /*
        Create a class called SyntaxEmployee:
        -create three variables empID (Static), salary (static)
        and set the ceo to sumair.
        -Create two objects of the class SyntaxEmployee
        -set the value of eID, salary for each objects
        -print out the eID, salary and CEO for each of the object
        */

        SyntaxEmployee Employee1= new SyntaxEmployee();

        Employee1.empId=123456;
        Employee1.salary=150000;

        System.out.println(Employee1.empId);
        System.out.println(Employee1.salary);
        System.out.println(Employee1.ceo);

        SyntaxEmployee Employee2= new SyntaxEmployee();
        Employee2.empId=654321;
        Employee2.salary=149999;

        System.out.println(Employee2.empId);
        System.out.println(Employee2.salary);
        System.out.println(Employee2.ceo);





    }//end of main
}//end of class
