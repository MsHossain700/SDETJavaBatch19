package org.example.Class21_Interface;

public class WashAbleTester {
    public static void main(String[] args) {
        WashAble D= new Dog();
        D.wash();

        WashAble S = new Sofa();
        S.wash();

        WashAble[] washAbles={new Dog(),new Sofa()};

        for (WashAble w:washAbles){
            w.wash();
        }



    }
}
