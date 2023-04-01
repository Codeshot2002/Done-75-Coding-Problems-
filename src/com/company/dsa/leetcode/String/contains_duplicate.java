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
    static int findSum(int A[],int N)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(A[i] < min){
                min = A[i];
            }if(A[i] > max){
                max = A[i];
            }
        }

        return min + max;
    }
    public static void main(String[] args) {
        int[] ar = {-1,-2,-3,-4,-5};
        System.out.println(findSum(ar,5));

    }
}
