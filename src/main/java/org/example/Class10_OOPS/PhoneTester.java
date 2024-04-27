package org.example.Class10_OOPS;

public class PhoneTester {
    public static void main(String[] args) {

        /*
create a class "Phone". create 3 objects of it: iphone, pixel, samsung.
create 3 to 5 attributes and three behavior
 */
        Phone samsung=new Phone();
        samsung.make="Samsung";
        samsung.model="note 330";
        samsung.color="Blue";
        samsung.price=1100;
        samsung.screenSize=6.5;
        System.out.println(samsung.make);
        System.out.println(samsung.model);
        System.out.println(samsung.color);
        System.out.println(samsung.price);
        System.out.println(samsung.screenSize);
        samsung.text();
        samsung.phoneCall();


        System.out.println();

        Phone iPhone=new Phone();
        iPhone.make="Iphone";
        iPhone.model="X770";
        iPhone.color="Blue";
        iPhone.price=4100;
        iPhone.screenSize=6.0;
        System.out.println(iPhone.make);
        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);
        System.out.println(iPhone.screenSize);
        iPhone.text();
        iPhone.phoneCall();


        System.out.println();

        Phone pixel=new Phone();
        pixel.make="Pixel";
        pixel.model="Pixel 330";
        pixel.color="Blue";
        pixel.price=1500;

        System.out.println(pixel.make);
        System.out.println(pixel.model);
        System.out.println(pixel.color);
        System.out.println(pixel.price);
        System.out.println(pixel.screenSize);
        pixel.text();
        pixel.phoneCall();

    }//end of main
}//end of class
