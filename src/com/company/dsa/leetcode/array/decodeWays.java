package com.company.dsa.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class decodeWays {
    static int numDecodings(String s) {
        int len = s.length();
        if(len <= 1) return 1;
        Set<Set<Integer>> result = new HashSet<>();
        //find no. of combinations formed from the string

        int t = 2;
        boolean flag = true;
        while(t-- > 0){
            Set<Integer> res = new HashSet<>();
            for(int i=0;i<len;i++){
                int first = Integer.parseInt(String.valueOf(s.charAt(i)));

                if(i<len-1){
                    int sec = Integer.parseInt(String.valueOf(s.charAt(i + 1)));
                    if(sec == 0){
                        res.add(first * 10);
                        i++;
                    }
                    else if(first == 1){
                        int temp = first*10 + sec;
                        res.add(temp);
                        i++;
                    }
                    else if(first == 2){
                        if(sec <= 6){
                            int temp = first*10 + sec;
                            res.add(temp);
                            i++;
                        }
                    }
                }
                if(first <= 26 && s.charAt(i) != 0 && flag){
                    res.add(first);
                }
            }  result.add(res);
            flag = false;
        }
        System.out.println(result);
        return result.size();
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("226"));
    }
}
