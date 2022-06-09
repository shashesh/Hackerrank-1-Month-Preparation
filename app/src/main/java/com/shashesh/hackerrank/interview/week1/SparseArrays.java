package com.shashesh.hackerrank.interview.week1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shashesh
 */
class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        
        List<Integer> sol = new ArrayList<>();
        for(String x : queries)sol.add(countStr(x,strings));//O(m)
        return sol;
    }
    
    private static Integer countStr(String s, List<String> strings){
       int count = 0;
       for(String x : strings)if(s.equals(x))count++; //O(n)
       return count;
    }

}

