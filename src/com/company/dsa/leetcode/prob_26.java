package com.company.dsa.leetcode;

import java.util.*;

//remove the duplicates from the array with o(1) space complexity
public class prob_26 {
    static int duplicate(int[] nums){
        int k = 0;
        Set<Integer> set = new LinkedHashSet<>();
        for(Integer a:nums){
            set.add(a);
        }
        Iterator<Integer> it = set.iterator();
        k = set.size();
        int i =0;
        while(it.hasNext()){
            nums[i++] = it.next();
        }
        return k;
    }
    static void shiftLeft(int[] arr,int start, int end){
        for(int i=start;i<end;i++){
            int temp = arr[i];
            arr[i-1] = temp;
        }
    }
    static int duplicate2(int[] arr){
        int val = 0;
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i] == arr[j]){
                    val++;
                    int temp = arr[j];
                    shiftLeft(arr,j+1,arr.length);
                    arr[arr.length - 1] = temp;
                    len--;
                }
            }
        }
        System.out.println("val : " + val);
        int k = arr.length-val;
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(duplicate2(arr));
        System.out.println(Arrays.toString(arr));
    }
}
