package com.company.dsa.leetcode;

import java.util.HashMap;

public class prob_13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] roman = s.toCharArray();
        int num = 0;
        int ans = 0;
        for(int i=0;i<roman.length;i++){
            num = map.get(roman[i]);
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("VIX"));
    }
}
