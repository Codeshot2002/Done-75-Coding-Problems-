package com.company.dsa.leetcode.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class static_range_sum {
    static List<Integer> range_sum(int n, int q, int[] nums, List<Integer> set){
        List<Integer> res = new ArrayList<>();
        int a = 0; int b = 1;
        for(int i=0;i<q;i++){
            int r = 0;
            int start = set.get(a);
            int end = set.get(b);
            for(int k = start-1;k<end;k++){
                r += nums[k];
            }
            res.add(r);
            a += 2;
            b += 2;
        }
        return res;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); int q = Integer.parseInt(input[1]);
        String[] nums_string = (br.readLine().split(" "));
        int[] nums = new int[nums_string.length];
        for(int i=0;i<nums_string.length;i++){
            nums[i] = Integer.parseInt(nums_string[i]);
        }
        List<Integer> set = new ArrayList<>();
        for(int j=0;j<q;j++){
            String[] queries = br.readLine().split(" ");
            set.add(Integer.parseInt(queries[0]));set.add(Integer.parseInt(queries[1]));
        }
        System.out.println(range_sum(n,q,nums,set));
    }
}
