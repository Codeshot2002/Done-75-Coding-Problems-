package com.company.dsa.take_inputs;

import java.util.Arrays;
import java.util.Scanner;
/*
2 -> Test cases
3 -> size
1 2 3 4 5 -> array
10 -> var
 */

public class sample2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int size = sc.nextInt();
            int[] ar = new int[size];
            for(int i=0;i<size;i++){
                ar[i] = sc.nextInt();
            }
            int var = sc.nextInt();
            System.out.println(size);
            System.out.println(Arrays.toString(ar));
            System.out.println(var);
        }
    }
}
