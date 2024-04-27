package org.example.Class21_Interface;
/*
Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimeter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface.
Test your code.
 */
public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of circle: " + (radius * radius) * Math.PI);

    }
    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of circle: " + (radius * 2) * Math.PI);

    }
}

class Square implements Shape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of square: " + length * length);

    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of square: " + length * 4);

    }
}
