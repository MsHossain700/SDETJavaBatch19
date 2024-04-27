package org.example.Class25_Maps;

import java.util.ArrayList;
import java.util.List;

/*
Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class Task_5 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);

        int sum = 0;

        for (int num : integerList) {
            sum+=num;

        }
        System.out.println(sum);



    }
}
