package com.company.dsa.take_inputs;

import java.util.Arrays;
import java.util.Scanner;

//Without test cases

public class sample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
