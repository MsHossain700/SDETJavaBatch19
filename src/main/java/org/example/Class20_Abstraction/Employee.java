package org.example.Class20_Abstraction;
/*
Develop a system to manage different types of employees in a company.
Base class: Employee with fields like name, id, and department,
and abstract methods calculateSalary() and reportWork().
Subclasses: FullTimeEmployee, PartTimeEmployee, Intern with specific
implementations of calculateSalary() based on their employment type.
For example, FullTimeEmployee might include a fixed salary, whereas
PartTimeEmployee salary might depend on the hours worked.
Tester class: EmployeeManagementTester to showcase calculating
salaries and reporting work for different employee types.
 */
public abstract class Employee {

    /*private String name;
    private String id;
    private String department;

    Employee(String name, String id, String department){
        this.name = name;
        this.id = id;
        this.department = department;
    }

    double calculateSalary(int hours);
    void reportWork();

}

class FullTimeEmployee extends Employee{
    FullTimeEmployee(String name, String id, String department){
        super(name, id, department);
    }
    double calculateSalary(){


        return 6000;
    }

*/
}