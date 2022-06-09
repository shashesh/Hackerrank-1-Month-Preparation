package com.shashesh.hackerrank.interview.week1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author shashesh
 */
public class TimeConversionTest {
    
    @Test
    public void testTimeConversion() {
        System.out.println("timeConversion");
        String s = "07:05:45PM";
        String expResult = "19:05:45";
        String result = TimeConversion.timeConversion(s);
        assertEquals(expResult, result);
    }
    
}
