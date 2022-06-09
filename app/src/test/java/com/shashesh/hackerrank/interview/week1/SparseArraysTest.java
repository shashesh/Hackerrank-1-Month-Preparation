package com.shashesh.hackerrank.interview.week1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shashesh
 */
public class SparseArraysTest {

    @Test
    public void testMatchingStrings() {
        System.out.println("matchingStrings");
        List<String> strings = new ArrayList<>(
                List.of("abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf",
                        "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"));
        List<String> queries = new ArrayList<>(
                List.of("abcde", "sdaklfj", "asdjf", "na", "basdn"));
        List<Integer> expResult = new ArrayList<>(
                List.of(1, 3, 4, 3, 2));
        List<Integer> result = SparseArrays.matchingStrings(strings, queries);
        assertEquals(expResult, result);
    }

}
