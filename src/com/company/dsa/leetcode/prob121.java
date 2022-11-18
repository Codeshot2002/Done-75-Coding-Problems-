package com.company.dsa.leetcode;
//best time to buy and sell stock
public class prob121 {
    static int best(int[] prices){
        int size = prices.length;
        int profit = 0;
        int min = prices[0];
        for(int i=1; i<size; i++) {
            if (prices[i] < min)
                min = prices[i];
            else if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
            System.out.println("Profit : " + profit);
            System.out.println("min : " + min);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] a = {2,1};
        System.out.println(best(a));
    }
}
