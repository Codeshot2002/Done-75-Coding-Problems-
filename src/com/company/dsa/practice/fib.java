package com.company.dsa.practice;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Scanner;

public class fib {
    public static long fib(long n){
        if(n<2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static long fib(long n, HashMap<Long,Long> memo){
        if(n<2){
            return n;
        }
        if(!memo.containsKey(n)){
            memo.put(n,(fib(n-1,memo) + fib(n-2,memo)));
        }
        return memo.get(n);
    }
    public static void main(String[] args) {
        System.out.println("Enter the fibonacci number you want : ");
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        long start = java.lang.System.currentTimeMillis();
        System.out.println("Fib with recursion : ");
        //System.out.println(fib(input));
        long end = java.lang.System.currentTimeMillis();
        System.out.println("Time taken : "+ (end - start) + "ms");
        System.out.println("-----------");
        long start1 = java.lang.System.currentTimeMillis();
        System.out.println("Fib with recursion using DYNAMIC PROGRAMMING : ");
        HashMap<Long,Long> memo = new HashMap<>();
        System.out.println(fib(input,memo));
        long end2 = java.lang.System.currentTimeMillis();
        System.out.println("Time taken : "+ (end2 - start1) + "ms");
    }
}
