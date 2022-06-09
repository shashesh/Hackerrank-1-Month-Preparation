/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.shashesh.hackerrank.interview.week1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 *
 * @author shash
 */
public class MiniMaxSumTest {
    
    @Test
    public void testMiniMAx() {

        List<Integer> testList = new ArrayList<>(
                List.of(1,2,3,4,5));

        MiniMaxSum.miniMaxSum(testList);
    }
    
}
