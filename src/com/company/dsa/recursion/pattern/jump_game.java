package com.company.dsa.recursion.pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class jump_game {
    static void helper(int[] ar, int i, int max, int count, List<Integer> list, HashMap<Integer,Integer> dp){
        if(i == ar.length-1){
            list.add(count);
            count = 0;
            return;
        }
        if(i > ar.length){
            count = 0;
            return;
        }
        if(max == 0) {
            count = 0;
            return;
        }
        else if(max > 0){
            for(int k = 1;k<=max;k++){
                if(k < ar.length){
                    helper(ar,i+k,ar[i+k],count+1,list,dp);
                }

            }
        }
    }
    static int canJump(int[] nums) {
        if(nums[0] == 0) return -1;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        helper(nums,0,nums[0],0,list,map);
        System.out.println(map);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i) < min && list.get(i) != 0) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] ar = {2,3,1,1,4};
        System.out.println(canJump(ar));
    }
}
