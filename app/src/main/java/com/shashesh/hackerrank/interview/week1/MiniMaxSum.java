package com.shashesh.hackerrank.interview.week1;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author shashesh
 */
class MiniMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long min = 0;
        long max = 0;

        List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());

        for(int i=0, j=4; i<arr.size()-1; i++, j--) {
            min += sortedList.get(i);
            max += sortedList.get(j);
        }

        System.out.println(min + " " + max);

    }

}
