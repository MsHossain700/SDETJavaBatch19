package org.example.Class18_Super_Method_Overloading;
/*
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe
result.
 */
public class Task_2 {
    public static void add(int a, int b){
        int result = (a+b);
        if (result>1){
            System.out.println("Is the suffering worth it?");
        }else {
            System.out.println("Why am I doing this?");
        }
    }

    public static void add(double a, double b){
        double result = (a+b);
        if (result>1){
            System.out.println("Is the suffering worth it?");
        }else {
            System.out.println("Why am I doing this?");
        }
    }

    public static void add(long a, long b){
        long result = (a+b);
        if (result>1){
            System.out.println("Is the suffering worth it?");
        }else {
            System.out.println("Why am I doing this?");
        }
    }

}
class Task_2_Tester {
    public static void main(String[] args) {

        Task_2 T2= new Task_2();
        T2.add(10.0,105l);

    }
}
