package com.company.dsa.leetcode;

import javax.swing.*;
import java.util.*;

public class minimum_window_substring {
    static String minWindow(String s, String t){
        int left = 0; int right = 0; int min = Integer.MAX_VALUE; boolean allValNull = false;
        Map<Character,Integer> fmap = new HashMap<>();
        List<Character> test =  new ArrayList<>();
        for(int i=0; i<t.length();i++){
            test.add(t.charAt(i));
        }
        List<Integer> vals = new ArrayList<>();
        while(left < s.length()){
            List<Character> test2 = test;
            while(right < s.length()){
                Character c = s.charAt(right);
                for(int i = 0;i<test2.size();i++){
                    if(test2.get(i) == c){
                        test.remove(i);
                    }
                }
                if(test2.isEmpty()) allValNull = true;
                if(allValNull){
                    if(right - left + 1 < min){
                        min = right - left + 1;
                        vals.add(0,left);
                        vals.add(1,right);
                    }
                    allValNull = false;
                    break;
                }
                right++;
            }
            left++;
            right = left;
        }
        if(!vals.isEmpty()){
            System.out.println(vals);
            return s.substring(vals.get(0),vals.get(1) + 1);
        }else{
            return "";
        }
    }


    //approach 2
    // Time complexity : O(t + s)
    static String minWindow2(String s, String t){
        int left = 0; int right = 0; int mCount = 0; int dcount = t.length();
        int min = Integer.MAX_VALUE;
        List<Integer> vals = new ArrayList<>();
        //setting up a hashmap and storing the values of the string T
        Map<Character, Integer> tMap = new HashMap<>();
        for(int i=0;i<t.length();i++){                                                                  //O(t)
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i),0) + 1);
        }
        Map<Character,Integer> sMap = new HashMap<>();
        while(right < s.length()){                                                                    //O(s)
            Character c = s.charAt(right);
            sMap.put(c, sMap.getOrDefault(c,0) + 1);
            if(sMap.getOrDefault(c,0) <= tMap.getOrDefault(c,0)){
                mCount ++;
            }
            while(mCount == dcount){
                //if the conditon of the window is satisfied then remove the element at index left and increament it by one.
                Character ch = s.charAt(left);
                if(sMap.get(ch) == 1) sMap.remove(ch);
                else sMap.put(ch, sMap.get(ch) - 1);
                if(right - left + 1 < min){
                    min = right - left + 1;
                    vals.add(0,left);
                    vals.add(1,right);
                }
                //reduce the mcount if important char was removed!
                if(sMap.getOrDefault(ch,0) < tMap.getOrDefault(ch,0)){
                    mCount--;
                }
                left++;
            }
           right++;
        }
        if(!vals.isEmpty()){
            return s.substring(vals.get(0), vals.get(1) + 1);
        }else{
            return "";
        }
    }
    public static void main(String[] args) {
        String s = "UMANGSHARMA";
        String t = "AA";
        System.out.println(minWindow2(s,t));

    }
}
