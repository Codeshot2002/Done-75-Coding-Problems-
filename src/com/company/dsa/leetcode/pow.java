package com.company.dsa.leetcode;

public class pow {
    static double myPow(double x, int n){
        if(n==0) return 1;
        if(n==1) return x;
        double out = 1;
        if(n>0) {
            for(int i=0;i<n;i++){
                out *= x;
            }
            return out;
        }
        if(n<0) {
            n = Math.abs(n);
            for(int i=0;i<n;i++){
                out *= x;
            }
            return 1/out;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -3));
    }
}
