package org.example.Class19_Method_Overloading;
/*
Create a Class Task_1_Student that will have 3 subclasses as SyntaxStudent,
CollegeStudent, SchoolStudent.
Define 3 common behavior within parent class and override some
methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class Student {

    void Uniform(){
        System.out.println("All students wear same uniform");
    }

    void Textbooks(){
        System.out.println("All student get free text books");
    }

    void Tuition(){
        System.out.println("Tuition is free for all students");
    }

    void Transportation(){
        System.out.println("School bus is available for all students");
    }


}

class SyntaxStudent extends Student{
    @Override
    void Transportation(){
        System.out.println("Class remote students do not need transportation");
    }
    @Override
    void Uniform(){
        System.out.println("Syntax students do not require uniform");
    }

}

class CollegeStudent extends Student{
    @Override
    void Tuition(){
        System.out.println("Tuition is not free all students");
    }
    @Override
    void Uniform(){
        System.out.println("College students do not require uniform");
    }

}

class  SchoolStudent extends Student{
    @Override
    void Transportation(){
        System.out.println("Students take public transportation");
    }

}

