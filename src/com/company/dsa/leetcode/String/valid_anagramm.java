package com.company.dsa.leetcode.String;

import java.util.*;

public class valid_anagramm {
    static boolean isAnagram(String s, String t) {
        int s1 = 0;int s2 = 0;
        for(int i=0;i<s.length();i++){
            s1 += s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            s2 += t.charAt(i);
        }
        if(s1 == s2){
            return true;
        }else{
            return false;
        }
    }

    static boolean isAnagram2(String s, String t){
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i=0;i<t.length();i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0) + 1);
        }
        if(map1.equals(map2)) return true;
        else return false;
    }

    //approach 2
    static boolean isAnagram3(String s, String t){
        int[] a1 = new int[26];
        for(int i=0;i<s.length();i++) {
            a1[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<t.length();i++){
           a1[s.charAt(i) - 'a']--;
        }
        for(int x : a1) {
            if (x!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram2("aa","a"));
    }
}
