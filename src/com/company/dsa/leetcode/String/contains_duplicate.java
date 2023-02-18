package com.company.dsa.leetcode.String;

import java.util.HashMap;
import java.util.HashSet;

public class contains_duplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int a : nums){
            hs.add(a);
        }
        if(hs.size() != nums.length){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[] ar = {1,2,3,5};
        System.out.println(containsDuplicate(ar));
    }
}
