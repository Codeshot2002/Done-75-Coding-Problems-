package com.company.dsa.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class merge_interval {
    public static int[][] merge(int[][] intervals) {
        Set<int[]> set = new HashSet<>();
        int k = 0;
        boolean flag = true;
        for(int i=0;i<intervals.length;i++){
            flag = true;
            for(int j=i+1;j<intervals.length && flag;j++){
                if(intervals[i][1] >= intervals[j][0]){
                    //if overlapping merge it
                    int[] temp = {intervals[i][0],intervals[j][1]};
                    set.add(temp);
                    //replace the result in main array
                    intervals[i] = intervals[j] = temp;
                    System.out.println(Arrays.deepToString(intervals));
                }else{
                    //if not overlapping, add it as it is
                    if(j == i+1){
                        set.add(intervals[i]);
                    }
                    if(flag){
                        set.add(intervals[j]);
                        i++;
                    }

                    flag = false;
                }
            }
        }
        int[][] result = new int[set.size()][2];
        Iterator<int[]> it = set.iterator();
        int a = 0;
        while(it.hasNext()){
            result[a++] = it.next();
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] in = {{1,4},{5,6}};
        System.out.println(Arrays.deepToString(merge(in)));
    }
}
