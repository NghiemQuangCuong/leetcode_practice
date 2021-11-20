package com.company.Easy.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cuongnghiem on 20/11/2021
 * https://leetcode.com/problems/roman-to-integer/
 **/

public class MainClass {

    public static void main(String[] args) {
        MainClass obj = new MainClass();
        System.out.println(obj.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        boolean substract = false;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                substract = true;
            } else if (!substract) {
                result += map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i)) - map.get(s.charAt(i-1));
                substract = false;
            }
        }

        return result;
    }
}
