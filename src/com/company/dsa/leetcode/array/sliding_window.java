package com.company.dsa.leetcode.array;

public class sliding_window {
    static int checksum(int[] a, int k){
        int max = 0;
        //sum of first window of size k
        for(int i=0;i<k;i++){
            max += a[i];
        }
        int window_sum = max;
        for(int i = k;i<a.length;i++){
            window_sum += a[i] - a[i-k];  //adding the element next to the window and subtracting the starting element of the previous window
            max = Math.max(max,window_sum);
        }

        return max;
    }
    public static void main(String[] args) {
        int[] ar = {500,200,300,400};
        int k = 3;
        System.out.println(checksum(ar,k));
    }
}
