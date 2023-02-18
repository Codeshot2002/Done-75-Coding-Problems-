package com.company.dsa.leetcode;

import java.io.CharArrayReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class longest_common_prefix {
    static int shortest(String[] strs){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            min = Math.min(min,strs[i].length());
        }
        return min;
    }
    static String longestCommonPrefix(String[] strs) {
        int len = shortest(strs);
        String out = "";
        HashMap<Character, Integer> map = new HashMap<>();
        int k = 0;
        for(int i=0;i<len;i++){
            while(k<strs.length){   // add first character of every element in the array
                map.put(strs[k].charAt(i), map.getOrDefault(strs[k].charAt(i),0) + 1);
                k++;
            }
            k = 0;
            if(map.get(strs[k].charAt(i)) % strs.length == 0){
                out += strs[k].charAt(i);
            }else{
                return out;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        String[] s = {"aa","aa","aa"};
        System.out.println(longestCommonPrefix(s));
    }
}
