package com.company.dsa.bit;

import java.util.ArrayList;
import java.util.List;

public class bitShifting {
    static List<String> subsequenceString(String input){
        int n = input.length();
        int PowerSetSize = (int) Math.pow(2,n);
        List<String> res = new ArrayList<>();
        for(int i=0;i<PowerSetSize;i++){
            String sub = "";
            for(int j=0;j<n;j++){
                if((i & (1<<j)) > 0){
                    sub += input.charAt(j);
                }
            }
            res.add(sub);
        }
        return res;
    }

    public static int lengthOfLIS(int[] nums){
        int n = nums.length;
        if(n==1) return 1;

        int size = (int) Math.pow(2,n);
        int max = -1;
        for(int i=0;i<size;i++) {
            List<Integer> list = new ArrayList<>();
            int currMax = 0;
            for(int j=0;j<n;j++){
                if((i & (1<<j)) > 0){
                    if(!list.isEmpty()){
                        if(list.get(list.size()-1) < nums[j]){
                            list.add(nums[j]);
                            currMax++;
                        }
                    }else{
                        list.add(nums[j]);
                        currMax++;
                    }
                }
            }

            max = Math.max(max,currMax);
        }
        return max;
    }
    public static void main(String[] args) {
        String a = "abcdefgh";
        List<String> subs = subsequenceString(a);
        System.out.println(subs);

        int[] ar = {0,1,0,3,2,3};
        System.out.println(lengthOfLIS(ar));
    }
}
