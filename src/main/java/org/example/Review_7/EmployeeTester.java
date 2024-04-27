package org.example.Review_7;

public class EmployeeTester {
    public static void main(String[] args) {
        System.out.println(Employee.getCompanyName());

        Employee obj1=new Employee("Mohammed",29,30000);
        double result = obj1.getBonus();
        System.out.println(result);

        obj1.printIfo();





    }//end of main
}//end of class
