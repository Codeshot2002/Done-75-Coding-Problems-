package com.company.dsa.practice;

import java.util.Arrays;

public class merge_sort {
    static void MERGE_SORT(int[] a,int beg, int end){
        if(beg>end){
            int mid = (beg+end)/2;
            MERGE_SORT(a,beg,mid);
            MERGE_SORT(a,mid+1,end);
            merge(a,beg,mid,end);
        }
    }

    static void merge(int[] a, int beg, int mid,int end){
        int i,j,k;
        int n1 = mid-beg+1;
        int n2 = end-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(i=0;i<n1;i++){
            left[i] = a[beg+1];
        }
        for(j=0;j<n2;j++){
            right[j] = a[mid+1+j];
        }
        i=0;j=0;k=beg;

        while(1<n1 && j<n2){
            if(left[i] <= right[j]){
                a[k] = left[i];
                i++;
            }
            else{
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k] = left[i];
            i++;k++;
        }
        while(j<n2){
            a[k] = right[j];
            j++;k++;
        }
    }

    public static void main(String[] args) {
        int[] ar = {5,1,25,2,4,7,1};
        System.out.println("Before : " + Arrays.toString(ar));
        MERGE_SORT(ar,0,ar.length);
        System.out.println("After : " + Arrays.toString((ar)));
    }
}
