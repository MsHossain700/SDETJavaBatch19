package org.example.Class21_Interface;
/*
Create a Class Vehicle that would have the following fields:
vehiclePrice and method calculateSalePrice() which should be
returning a price of the Vehicle.
Create 2 subclasses: Sedan and Truck.
The Sedan class has field as length and also does it its own
implementation of calculateSalePrice(): if length of sedan is >20
feet then returned car price should include 5% discount,
otherwise 10% discount
The Truck class has field as weight and has its own
implementation of  calculateSalePrice() method in which returned
price calculated as following: if weight>2000 then returned price
car should include 10% discount, otherwise 20% discount.

 */
public class VehicleTester {
    public static void main(String[] args) {
        Sedan S = new Sedan(35000,15);
        S.calculateSalePrice();
        double sedanSalePrice = S.calculateSalePrice();
        System.out.println("Sedan Sale Price: $"+sedanSalePrice);

        Truck T = new Truck(50000,5000);
        double truckSalePrice = T.calculateSalePrice();
        System.out.println("Truck Sale Price: $" + truckSalePrice);
    }
}
