package com.company.dsa.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class counting_sort {
    static int max(int[] ar){
        int max = ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        return max;
    }
    static void counting(int[] ar){
        int max = max(ar);
        int[] a = new int[max+1];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            a[ar[i]]++;
        }
        int y = 0;
        for(int j=0;j<a.length;j++){
            int index = a[j];
            for(int k=0;k<index;k++){
                ar[y] = j;
                y++;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {3,5,1,2,2,2,2,10,14,6,5,1,2,3};
        System.out.println("Before : " + Arrays.toString(a));
        counting(a);
        System.out.println("After : " + Arrays.toString(a));
    }
}
