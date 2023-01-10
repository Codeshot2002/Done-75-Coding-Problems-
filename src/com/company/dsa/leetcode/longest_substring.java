package com.company.dsa.leetcode;

import java.util.HashSet;
import java.util.Set;

public class longest_substring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longest(s));
    }

    static int longest(String s) {
        int left = 0; int right = 0;
        int max = 0;
        Set<Character> seen = new HashSet<>();
        while(right < s.length()){
            Character c = s.charAt(right);
            if(seen.add(c)){
                max = Math.max(max,right - left + 1);
                right++;
            }
            else{
                while(s.charAt(left) != c){
                    seen.remove(s.charAt(left));
                    left++;
                }
                seen.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
