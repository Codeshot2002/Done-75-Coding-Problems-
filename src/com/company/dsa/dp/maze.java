package com.company.dsa.dp;

import java.util.Scanner;

public class maze {
    static long helper(int i, int j, long m, long n, long[][] dp){
        if(i == m-1 && j == n-1){
            return 1;
        }
        if(i >= m || j >= n) return 0;
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        long right = helper(i,j+1,m,n,dp);
        long down = helper(i+1,j,m,n,dp);
        return dp[i][j] = right + down;
    }
    static long unique(int m,int n){
        long[][] dp = new long[m+1][n+1];
        return helper(0,0,m,n,dp);
    }
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println("Number of all possible paths : " + unique(m, n));
        }
    }
}
