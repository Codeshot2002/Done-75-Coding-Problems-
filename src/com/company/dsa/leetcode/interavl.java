package com.company.dsa.leetcode;

import com.company.dsa.leetcode.String.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class interavl {
    static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int[] inter = new int[2];
        int f = newInterval[0];
        int s = newInterval[1];
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(intervals[i]);
            if(f >= intervals[i][0] && f <= intervals[i][1]){
                int j = i;
                while(j < n && intervals[j][1] <= s){
                    j++;
                }
                inter[0] = intervals[i][0];
                inter[1] = Math.max(s,intervals[j][1]);
                list.remove(list.size()-1);
                list.add(inter);
                i = j;
            }
        }
        int[][] ar = new int[list.size()][2];
        int k =0;
        for(int[] x : list){
            ar[k++] = x;
        }
        return ar;
    }

    public static void main(String[] args) {
        int[][] in = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] nin = {4,8};

        System.out.println(Arrays.deepToString(insert(in,nin)));
    }
}
