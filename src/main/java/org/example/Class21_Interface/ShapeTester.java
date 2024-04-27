package org.example.Class21_Interface;
/*
Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface.
Test your code.
 */
public class ShapeTester {
    public static void main(String[] args) {
        Shape[]shapes={new Circle(2.5),new Square(3)};
        for (Shape s:shapes) {
            s.calculateArea();
            s.calculatePerimeter();
        }
    }
}
