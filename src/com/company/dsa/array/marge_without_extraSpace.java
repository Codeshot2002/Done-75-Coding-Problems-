package com.company.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class marge_without_extraSpace {
    static void merge(int[] ar1, int[] ar2, int n,int m){
        int min = -1;
        int temp = -1;
        for(int i=0;i<n;i++){
            if(ar1[i] < ar2[0]){
                min = ar1[i];
            }
            else{
                min = ar2[0];
            }
        }
        for(int i=0;i<n;i++){
            temp = ar1[i];
            ar1[i] = min;
            ar2[0] = temp;
        }
    }
    public static void main(String[] args) {
        int[] ar1 = {10,12};
        int[] ar2 = {5,18,20};
        int n = ar1.length;
        int m = ar2.length;
        merge(ar1,ar2,n,m);
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));
    }
}
