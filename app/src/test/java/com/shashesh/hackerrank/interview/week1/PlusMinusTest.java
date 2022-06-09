package com.shashesh.hackerrank.interview.week1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 *
 * @author shashesh
 */
public class PlusMinusTest {

    @Test
    public void testMain() {

        List<Integer> testList = new ArrayList<>(
                List.of(-4, 3, -9, 0, 4, 1));

        PlusMinus.plusMinus(testList);
    }

}
