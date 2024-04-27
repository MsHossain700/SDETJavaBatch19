package org.example.Class8;

public class E1_Break {
    public static void main(String[] args) {

        String [] names= {"James","Iram","Fab","Aladin","Ana","Silvia"};
        /*
        search for the name Iram. If it is present print on the console
        name is present
         */

        // Search for the name "Iram"
       String name = "Iram";
       for (String n:names) {

           if (n.equals(name)) {
               System.out.println(n + " is present");
               break; /* break is used to stop the loop to continue if
               result is met */


           }

       }




    }//end of main

}//end of class
