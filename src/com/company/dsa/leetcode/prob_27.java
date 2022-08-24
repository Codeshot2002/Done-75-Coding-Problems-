package com.company.dsa.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

//remove element
public class prob_27 {
    static void shiftLeft(int[] arr,int start, int end){
        for(int i=start;i<end-1;i++){
            arr[i] = arr[i+1];
        }
    }
    static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int k =0;
        for(int i=0;i<len;i++){
            if(nums[i] == val){
                shiftLeft(nums,i,len);
                i--;
                k++;
            }
        }
        return nums.length-k;
    }
    static int removeElement2(int[] nums, int val){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val ){
                continue;
            }
            list.add(nums[i]);
        }
        for(int j=0;j<list.size();j++){
            nums[j] = list.get(j);
        }
        return list.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};
        //System.out.println(removeElement(arr,2));
        System.out.println(removeElement2(arr,2));
        System.out.println(Arrays.toString(arr));

    }
}
