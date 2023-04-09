package com.company.dsa.take_inputs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
2 -> Test cases
3 -> size
1 2 3 4 5 -> array
10 -> var
 */


public class sample1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] array = br.readLine().split(" ");

            int[] arr = new int[size];
            int i = 0;
            for(String x : array){
                arr[i++] = Integer.parseInt(x);
            }

            int var = Integer.parseInt(br.readLine());
            //write the function over here
        }
        System.out.println();
    }
}
