package org.example.Class18_Super_Method_Overloading;

public class GP {
    GP(){
        System.out.println("Grandpa");
    }
}

class P extends GP{
    P(){
        System.out.println("Parent");
    }

}

class C extends P{
    C(){
        System.out.println("Child");
    }
}

class GPTester{
    public static void main(String[] args) {
        C c=new C();
    }
}

