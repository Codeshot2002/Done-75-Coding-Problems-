package com.company.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
//Missing number problem #4
public class Missing_number {
    static int missing(int[] arr, int n){
        int miss = -1;
        Arrays.sort(arr);
        for(int i =1;i<n;i++){
            System.out.println("i : " + i + "\n arr[i-i] : " + arr[i-1] );
            if(arr[i-1] != i){
                miss = i;
                return miss;
            }
            else{
                miss = i+1;
            }
        }
        return miss;
    }

    public static void main(String[] args) {
        int [] ar = {6,1,2,8,3,4,7,10,5};
        System.out.println(missing(ar,ar.length+1));
    }
}
