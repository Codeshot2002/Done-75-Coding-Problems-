package com.company.dsa.array;

import java.util.Arrays;

public class rearange_array_alternatively {
    static void rearrange(long arr[], int n){
        int i,j,k,len;
        i = k = 0;
        len = n;
        j = len-1;
        long[] res = new long[len];
        while(k<len){
            if(k%2==0){
                res[k] = arr[j-i];
            }
            else{
                res[k] = arr[i];
                i++;
            }
            k++;
        }
        arr = res;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        long[] arr = {1,2,3,4,5};
       rearrange(arr,arr.length);
    }
}
