package com.company.dsa.graph;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.Arrays;

public class p1 {
    static int findMax(int[] a){
        int max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    static void countingSort(int[] a, boolean order){
        int[] res = new int[findMax(a) + 1];
        for(int i=0;i<a.length;i++){
            res[a[i]] += 1;
        }
        int k = 0;
        if(order){
            for(int j=0;j<res.length;j++){
                if(res[j]>0){
                    int n = res[j];
                    while(k<n){
                        System.out.print(j + ", ");
                        k++;
                    }
                    k = 0;
                }
            }
        }
        else{
            for(int j=res.length-1;j>0;j--){
                if(res[j]>0){
                    int n = res[j];
                    while(k<n){
                        System.out.print(j + ", ");
                        k++;
                    }
                    k = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] ar = {5,7,11,16,2,1,16,3,2,1};
        System.out.println(Arrays.toString(ar));
        System.out.println("After : ");
        countingSort(ar,false);
    }
}
