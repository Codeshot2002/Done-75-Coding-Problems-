package com.company.dsa.array;

import java.util.Arrays;

public class replace_zero {
    static int[] move(int[] ar){
        int[] array = new int[ar.length];
        int count = 0;
        int k = 0;
        for(int i=0;i<ar.length;i++){
            if(ar[i] > 0){
                array[k++] = ar[i];
            }
            if(ar[i] == 0){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            if(k<array.length-1){
                array[k+1] = 0;
            }
            else{
                array[k] = 0;
            }
            k++;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] ar = {1,3,1,0,4,2,0,5};
        System.out.println("Before : " + Arrays.toString(ar));
        System.out.println("After : " + Arrays.toString(move(ar)));
    }
}
