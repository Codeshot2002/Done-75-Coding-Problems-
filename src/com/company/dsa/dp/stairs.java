package com.company.dsa.dp;

public class stairs {
    static int func(int n){
        if(n==1)return 1;
        if(n==2) return 2;
        return  func(n-1) ;
    }

    public static void main(String[] args) {
        System.out.println(func(10));
    }
}
