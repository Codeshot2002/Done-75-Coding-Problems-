package com.company.dsa.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

//next permutation    diff: medium
public class prob_31 {
    static void swap(int[] array,int index1,int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    static void nextPermutation(int[] nums){
        ArrayList<Integer> a = new ArrayList<>();
        for(Integer x : nums){
            a.add(x);
        }
        if(a.size()==3){
            if(a.get(2) > a.get(1)){
                swap(nums,1,2);
            }
            else if(a.get(1) > a.get(2)){
                swap(nums,0,2);
            }
            else if(a.get(0) > a.get(1)){
                swap(nums,2,0);
            }
        }
        else if(a.size() == 2){
            swap(nums,0,1);
        }
        else {
            return;
        }
    }

    public static void main(String[] args) {
        int[] ar = {2,1};
        nextPermutation(ar);
        System.out.println(Arrays.toString(ar));
    }
}
