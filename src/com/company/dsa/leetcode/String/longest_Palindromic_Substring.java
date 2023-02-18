package com.company.dsa.leetcode.String;

import java.util.ArrayList;
import java.util.List;

public class longest_Palindromic_Substring {
    static String listToString(List<Character> list){
        String out = "";
        for(int i=0;i<list.size();i++){
            out += list.get(i);
        }
        return out;
    }
    static boolean check(String s, int max){
        if(s.length() > max){
            StringBuilder sb = new StringBuilder(s);
            return s.equals(sb.reverse().toString());
        }else{
            return false;
        }
    }
    static public String longestPalindrome(String s) {
        int left = 0; int right = 0;
        int max = 0;
        List<Integer> window = new ArrayList<>();
        List<Character> seen = new ArrayList<>();
        while(left < s.length()){
            while(right < s.length()){
                Character c = s.charAt(right);
                seen.add(c);
                if(check(listToString(seen),max)){
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
    // Faster approach
    static boolean check2(String s, int left, int right){
        String out = s.substring(left,right + 1);
        StringBuilder sb = new StringBuilder(out);
        return out.equals(sb.reverse().toString());
    }
    static String longestPalindrome2(String s){
        int left = 0; int right = 0; int max = 0;
        List<Integer> window = new ArrayList<>();
        while (left < s.length()){
            Character c = s.charAt(left);
            while(right < s.length()){
                if(c == s.charAt(right)){
                    int len = right - left + 1;
                    if(len > max){
                        if(check2(s,left,right)){
                            max = len;
                            window.add(0,left); window.add(1,right);
                        }
                    }
                }
                right++;
            }
            left++;
            right = left + 1;
        }
        if(!window.isEmpty()){
            return s.substring(window.get(0), window.get(1) + 1);
        }else{
            return "nill";
        }
    }

    public static void main(String[] args) {
        String s = "a";
        //System.out.println(longestPalindrome(s));
        System.out.println(longestPalindrome2(s));
    }
}
