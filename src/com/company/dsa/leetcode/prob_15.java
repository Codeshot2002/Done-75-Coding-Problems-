package com.company.dsa.Leetcode;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

//3sum diff: med
public class prob_15 {
    static List<List<Integer>> threeSum(int[] nums){
        Set<Integer> num = new HashSet<Integer>();
        for(Integer a: nums){
            num.add(a);
        }
        int[] arr = new int[nums.length-1];
        int b = 0;
        for(Integer a : num){
            arr[b++] = a;
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length-1;k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> res1 = new ArrayList<>();
                        res1.add(arr[i]);res1.add(arr[j]);res1.add(arr[k]);
                        res.add(res1);
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ar = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(ar));
    }
}
