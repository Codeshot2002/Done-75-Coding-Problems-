package com.company.dsa.sorting;

import java.util.Arrays;

public class merge_sorrt {
    static void merge(int[] a, int start, int end){
        if(start < end){
            int mid = (start + end) / 2;
            merge(a,start,mid);
            merge(a,mid+1,end);
            algo(a,start,mid,end);
        }
    }
    static void algo(int[] a, int start, int mid, int end ){
       int i,j,k;
       int n1 = mid - start + 1;
       int n2 = end - mid ;

       int left[] = new int[n1];
       int right[] = new int[n2];

       for(i=0;i<n1;i++){
           left[i] = a[start + i];
       }
       for(j = 0;j<n2;j++){
           right[j] = a[mid + j + 1];
       }

       i = 0;
       j = 0;
       k = start;

       while(i<n1 && j < n2){
           if(left[i] < right[j]){
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
        int[] a = {38,27,43,3,9,82,10};
        System.out.println("Before : " + Arrays.toString(a));
        merge(a,0,a.length-1);
        System.out.println("After : " + Arrays.toString(a));
    }
}
