package com.company.dsa.leetcode.String;

import java.util.*;

public class longest_substring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longest(s));
        System.out.println(longestPalindrome("babad"));
//        List<Character> seen = new ArrayList<>();
//        seen.add('b');
//        seen.add('a');
//        seen.add('b');
//        System.out.println(listToString(seen));

    }
    static String listToString(List<Character> list){
        String out = "";
        for(int i=0;i<list.size();i++){
            out += list.get(i);
        }
        return out;
    }
    static boolean check(String s){
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    static String longestPalindrome(String s) {
       int left = 0; int right = 0;
       int max = 0;
       List<Integer> window = new ArrayList<>();
       List<Character> seen = new ArrayList<>();
       while(left < s.length()){
           while(right < s.length()){
               Character c = s.charAt(right);
               seen.add(c);
               if(check(listToString(seen))){
                   if(right - left + 1 > max){
                       max = right - left + 1;
                       window.add(0,left);
                       window.add(1, right);
                   }
               }
               right++;
           }
           seen.clear();
           left++;
           right = left;
       }
       if(window.isEmpty()) return "";
       else return s.substring(window.get(0), window.get(1)+1);
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
