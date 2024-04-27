package org.example.Class12_StringBuilder;

public class Task_6 {
    /*
    Create a method that will say hello in different language based on
    the country that will be passed when method is executed.
    Do it for any 5 countries
     */
    void sayHello(String country) {
        switch (country.toLowerCase()) {
            case "usa":
                System.out.println("Hello!");
                break;
            case "france":
                System.out.println("Bonjour!");
                break;
            case "germany":
                System.out.println("Guten Tag!");
                break;
            case "japan":
                System.out.println("Konnichiwa!");
                break;
            case "china":
                System.out.println("Nǐ hǎo!");
                break;
            default:
                System.out.println("Invalid input");
        }//end of switch

    }


}//end of class
