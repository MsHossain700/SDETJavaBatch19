package org.example.Class19_Method_Overloading;

public class Parent_2_Final {

    private final String name = "Albarran";

    void marry_2_Final(){
        System.out.println("Marry the girl we choose for you");

    }
}
class Alex2_Final extends Parent_2_Final{

    void marry_2_Final(){
        System.out.println("I want to marry Jason Momoa");
    }
}

class ParentTester_2_Final{
    public static void main(String[] args) {
        Alex c = new Alex();
        c.marry();


    }
}