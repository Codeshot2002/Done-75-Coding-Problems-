package com.company.dsa.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class coinChange {
    static int helperMem(int[] coins,int amount,int[] dp){
        if(amount == 0){
            return 0;
        }
        if(amount < 0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount] != -1){
            return dp[amount];
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            if(coins[i] <= amount){
                int ans = helperMem(coins,amount - coins[i],dp);
                if(ans != Integer.MAX_VALUE){
                    min = Math.min(1 + ans,min);
                }
            }
        }
        dp[amount] = min;

        return min;
    }
    static int coinChan(int[] coins, int amount){
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,-1);
        int ans = helperMem(coins,amount,dp);
        if(ans == Integer.MAX_VALUE) return -1;
        else return ans;
    }
    public static void main(String[] args) {
//        int amount = 22;
//        int[] coins = {2,5};
//        System.out.println(coinChan(coins,amount));
        List<Integer> list = new ArrayList<>();
        int[] ar = {2,2,3,3,3,4};
        for(int x : ar){
            list.add(x);
        }
        System.out.println(list);
        int remove = list.remove(2);
        System.out.println("Remove" + remove);
        System.out.println(list);
    }
}
