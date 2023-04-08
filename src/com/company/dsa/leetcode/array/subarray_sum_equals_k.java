package com.company.dsa.leetcode.array;

import java.util.Arrays;

public class subarray_sum_equals_k {
    static public int subarraySum(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = 0, res = 0;
        while(right < nums.length){
            if(left == right){
                if(nums[left] == k){
                    res++;
                    left++;
                    right++;
                }
                else{
                    right++;
                }
            }
            else if(left != right){
                if(nums[left]+nums[right] == k){
                    res++;
                    left = right;
                }else if(nums[left] + nums[right] > k){
                    left++;
                }else{
                    right++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,3};
        System.out.println(subarraySum(ar,3));
    }
}
