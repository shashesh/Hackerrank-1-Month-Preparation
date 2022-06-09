package com.shashesh.hackerrank.interview.week1;

import java.util.*;

class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        int arrLength = arr.size();
        double positiveNumber=0;
        double negativeNumber=0;
        double zeroNumbered = 0;

        for(int i : arr) {
            if(i > 0) {
                positiveNumber++;
            } else if(i < 0) {
                negativeNumber++;
            } else {
                zeroNumbered++;
            }
        }
        
        System.out.printf("%.6f%n", positiveNumber/arrLength);
        System.out.printf("%.6f%n", negativeNumber/arrLength);
        System.out.printf("%.6f%n", zeroNumbered/arrLength);
         
    }

}

