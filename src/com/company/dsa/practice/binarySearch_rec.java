package com.company.dsa.practice;

import java.math.BigDecimal;
import java.math.BigInteger;

public class binarySearch_rec {
    //binary search using recursion
    static int binarySearch(int[] ar, int target, int start, int end){
            if(start>end){
                return -1;
            }
            int mid = start + (end-start)/2;
            if (ar[mid] == target) {
                return mid;
            }
            if (target < ar[mid]) {
                return binarySearch(ar, target, start, mid - 1);
            }
            return binarySearch(ar,target,mid+1, end);
        }
        //factorial using recursion
    static BigInteger factorial(BigInteger n){
        if(n.equals(new BigInteger("1"))) return new BigInteger("1");
        return n.multiply(factorial(n.subtract(new BigInteger("1"))));
    }

    //sum of digits
    static int sumI(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    static int sumR(int n){
        if(n==0) return 0;
        return sumR(n/10) + n%10;
    }
    //reverse a number using recursion
    static int reverse(int n){
        int x = 0;
        while(n>0){
            x = x*10 + n%10;
            n /= 10;
        }
        return x;
    }
    static int reverseRec(int x,int y){
        if(x==0) return y;
        y += x%10;
        if(x>10) y *= 10;
        return reverseRec(x/10,y);
    }
    static int countZero(int x){
        int count = 0;
        while(x>0){
            if(x%10==0){
                count++;
            }
            x /= 10;
        }
        return count;
    }
    static int countZeroRec(int x){
        return helper(x,0);
    }
    static int helper(int x,int y){
        if(x==0) return y;
        if(x%10==0) y++;
        return helper(x/10,y);
    }
    public static void main(String[] args) {
        int[] ar = {1,5,7,9,14,18,25,51,61,68};
        //System.out.println(binarySearch(ar,68,0,ar.length-1));
        //fun(5);
        //fun2(5);
        System.out.println(factorial(new BigInteger("5")));
        //System.out.println(sumI(123));
        System.out.println(sumR(543));
        System.out.println("-----------");
        System.out.println(reverse(123));
        System.out.println("--------------");
        System.out.println(reverseRec(54321,0));
        System.out.println("--------count zeroes ----------");
        System.out.println(countZero(102040010));
        System.out.println("Recursion");
        System.out.println(countZeroRec(100030));
    }
}
