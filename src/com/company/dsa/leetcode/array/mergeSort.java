package com.company.dsa.leetcode.array;

import java.util.Arrays;

public class mergeSort {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0,k=0;
        int[] temp = nums1;
        while(i < m && j < n){
            if(temp[i] < nums2[j]){
                nums1[k++] = temp[i++];
            }
            else{
                nums1[k++] = nums2[j++];
            }
        }
        while(i < m){
            nums1[k++] = temp[i++];
        }
        while(j < n){
            nums1[k++] = nums2[j++];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        System.out.println("Before");
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println("after");
        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}
