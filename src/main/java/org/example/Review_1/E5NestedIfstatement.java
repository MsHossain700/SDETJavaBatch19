package org.example.Review_1;

public class E5NestedIfstatement {
    public static void main(String[] args) {
        boolean haveCoupon=true;
        int coupon=20;

        if(haveCoupon){

            if(coupon==10){
                System.out.println("Apply 10% discount");
            }else if(coupon==20){
                System.out.println("Apply 20% discount");
            }else{
                System.out.println("Wrong coupon code");
            }

        }
    }
}
