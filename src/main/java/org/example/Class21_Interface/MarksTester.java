package org.example.Class21_Interface;

public class MarksTester {
    public static void main(String[] args) {
        studentA studentA = new studentA(85, 90, 95);
        studentB studentB = new studentB(75, 80, 85, 90);

        studentA.calculateAverage();
        studentB.calculateAverage();
    }
}
