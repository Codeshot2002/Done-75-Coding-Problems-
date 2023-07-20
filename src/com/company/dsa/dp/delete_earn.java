package com.company.dsa.dp;

import java.util.List;

public class delete_earn {
    static int helper(int idx,int num ,int[] ar, int ans){
        if(idx == ar.length) return ans;
        if(ar[idx] == 0) return ans;
        ans += ar[idx];
        for(int k=0;k<ar.length;k++){
            int temp = ar[k];
            if(temp == num + 1) ar[k] = 0;
            else if(temp == num - 1) ar[k] = 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i=1;i<ar.length;i++){
            int out = ans + helper(i,ar[i],ar,ans);
            max = Math.max(ans,max);
        }
        return max;
    }
    static public int deleteAndEarn(int[] nums) {
        return helper(0,nums[0],nums,0);
    }
    public static void main(String[] args) {
        int[] ar = {3,4,2};
        System.out.println(deleteAndEarn(ar));
    }
}
