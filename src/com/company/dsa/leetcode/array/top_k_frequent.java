package com.company.dsa.leetcode.array;

import java.util.*;

public class top_k_frequent {
    static int get_key(HashMap<Integer, Integer> input_map,Integer val){
        for(Map.Entry<Integer, Integer> entry: input_map.entrySet()) {
            if(entry.getValue() == val) {
                return entry.getKey();
            }
        }
        return -1;
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1); //count the frequency
        }
        System.out.println(map);
        int[] res = new int[k];

        for(int i=0; i<k;i++){
            int max = Collections.max(map.values());
            res[i] = get_key(map,max);
            map.remove(res[i]);
        }
        System.out.println(map);
        return res;
    }
    static public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int total = 0;
        boolean flag = false;
        boolean first = false;
        int zero = 0;
        for(int x = 0;x<n;x++){
            if(nums[x] == 0) {
                zero++;
                flag = true;
                continue;
            }
            if(!first){
                total = 1;
                first = true;
            }
            total *= nums[x];
        }
        for(int x = 0;x<n;x++){
            if(!flag){
                ans[x] = total / nums[x];
            }
            else{
                if(zero > 1){
                    ans[x] = 0;
                }
                else if(nums[x] == 0){
                    ans[x] = total;
                }else{
                    ans[x] = 0;
                }
            }
        }
        return ans;
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        Arrays.sort(nums);
        int l = 0, r = 1, cMax = 0, max = 0,diff = nums[r] - nums[l];
        while(r < nums.length){
            if(nums[r] - nums[l] == diff){
                if(nums[l] != nums[r])  cMax += 1;
            }
            else{
                diff = nums[r] - nums[l];
                l++;
                cMax = 0;
            }
            max = Math.max(cMax,max);
            r++;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
