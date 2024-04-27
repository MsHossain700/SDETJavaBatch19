package org.example.Class21_Interface;

public interface WashAble {

    void wash();
}

class Dog implements WashAble{

    @Override
    public void wash(){
        System.out.println("You can wash a dog");
    }
}

class Sofa implements WashAble{
   public void wash(){
       System.out.println("You can wash a sofa as well");
   }
}

