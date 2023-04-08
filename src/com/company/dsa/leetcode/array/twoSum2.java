package com.company.dsa.leetcode.array;

import java.util.Arrays;

public class twoSum2 {
    static int bSearch(int[] ar,int start ,int t){
        int end = ar.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(ar[mid] == t) {
                return mid;
            }
            else if(t < ar[mid] ){
                end = mid - 1;
            }
            else if(t > ar[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
    static int[] twoSum(int[] numbers, int target) {
        //bruteforce approach
        // int[] res = new int[2];
        // res[0] = -1;
        // res[1] = -1;
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i] + numbers[j] == target){
        //             res[0] = i + 1;
        //             res[1] = j + 1;
        //             return res;
        //         }
        //     }
        // }
        // return res;

        //Faster approach
        int[] res = new int[2];
        for(int i=0;i<numbers.length;i++){
            int newTarget = target - numbers[i];
            int s = bSearch(numbers,i+1 ,newTarget);
            System.out.println(s +  " : s" + "\nnt : " + newTarget);
            if(s != -1){      //it exists in the array
                res[0] = i + 1;
                res[1] = s + 1;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] ar = {2,3,4};
        System.out.println(Arrays.toString(twoSum(ar,6)));
    }
}
