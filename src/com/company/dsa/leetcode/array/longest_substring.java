package com.company.dsa.leetcode.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class longest_substring {
    static public int lengthOfLongestSubstring(String s) {
        char[] word = s.toCharArray();
        Map<Character, Integer> hs = new LinkedHashMap<>();
        for(Character c : word){
            Integer integer = hs.get(c);
            if(integer == null){
                hs.put(c,1);
                System.out.print(c);
            }
            else{
                hs.put(c,integer+1);
                System.out.print("||");
                integer = 0;
            }
        }
        System.out.println();
        System.out.println(hs);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
