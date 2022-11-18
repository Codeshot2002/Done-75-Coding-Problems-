package com.company.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static void reverse(int[] a, int n){
        int i,j;
        j = 0;
        int[] r = new int[a.length];
        for(i = a.length-1;i>=0;i--){
           r[j] = a[i];   j++;
        }
        System.out.println(Arrays.toString(r));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String[] a = br.readLine().split(" ");
            int[] arr = new int[a.length];
            for(int i=0;i<a.length;i++){
                arr[i] = Integer.parseInt(a[i]);
            }
            reverse(arr,n);
        }
    }
}
