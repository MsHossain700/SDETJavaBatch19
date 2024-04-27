package org.example.Class25_Maps;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeSalary {

    public static void main(String[] args) {
        Map<String,Double> EmployeeMap=new TreeMap<>();

        EmployeeMap.put("Sahadat Hossain", 150000.0);
        EmployeeMap.put("John Smith", 600000.0);
        EmployeeMap.put("Bob Saget", 700000.0);

        String name="";

        double maxSalary = Double.MIN_VALUE;

        for (Map.Entry<String, Double> entry : EmployeeMap.entrySet()) {
            double salary = entry.getValue();
            if (salary > maxSalary) {
                maxSalary = salary;
                name = entry.getKey();
            }
        }
        System.out.println("Employee with the highest salary: " + name);
        System.out.println("Highest salary: " + maxSalary);






    }//end of main
}//end of class
