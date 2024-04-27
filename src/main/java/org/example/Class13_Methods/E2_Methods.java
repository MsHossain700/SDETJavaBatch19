package org.example.Class13_Methods;

public class E2_Methods {

    int addArray(int [] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;
    }

    public static void main (String[] args){
        E2_Methods e2 = new E2_Methods();
        int [] ar={10,20,30};
        int result = e2.addArray(ar);
        System.out.println(result);

    }


}//end of main

