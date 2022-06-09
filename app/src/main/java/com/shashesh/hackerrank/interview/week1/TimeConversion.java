/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shashesh.hackerrank.interview.week1;

class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    
       if (s.charAt(8) == 'A') {
            if (Integer.valueOf(s.substring(0,2)) == 12) {
                return "00" + s.substring(2, 8);
            }
        } else if (s.charAt(8) == 'P') {
            if (Integer.valueOf(s.substring(0,2)) != 12) {
                int hours = Integer.valueOf(s.substring(0,2)) + 12;
                return "" + hours + s.substring(2, 8);
            }
        }
        return s.substring(0, 8);
    }

}

