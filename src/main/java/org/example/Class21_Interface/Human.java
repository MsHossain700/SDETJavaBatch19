package org.example.Class21_Interface;

public interface Human {

    void Walk();
}
interface Person extends Human{

    void Speak();
}

interface Employee extends  Person{

    void work();
}

class SyntaxEmployee implements Employee{


    @Override
    public void Walk() {
        System.out.println("Employee walking");
    }

    @Override
    public void Speak() {
        System.out.println("Employee speaking");
    }

    @Override
    public void work() {
        System.out.println("Employee working");
    }
}
