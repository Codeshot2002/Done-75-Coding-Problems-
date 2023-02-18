package com.company.dsa.leetcode.array;

import java.util.ArrayList;

public class subarray_with_givenSum {
    //Problem 1 from must to do questions from GFG
    static ArrayList<Integer> subarraySum(int [] arr, int n, int s){
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        int i,j;
        i = j = 0;
        while(j<n){    //till it reaches to the end of array
            sum += arr[j];
            while(sum>s){      //this will remove the starting element to find the solution
                sum -= arr[i];
                i++;
            }
            if(sum==s){
                if(i>j)break;    //if no solution is find
                res.add(i+1);
                res.add(j+1);
                break;
            }
            j++;
        }
        if(res.isEmpty()){
            res.add(-1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int s = 14;
        System.out.println(subarraySum(arr,arr.length,s));
    }
}
