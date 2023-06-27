package com.company.dsa.practice;
import java.util.*;
public class priorityQuee {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Set<Integer> log = new HashSet<>();
        for(int i=0;i<logs.length;i++){
            log.add(logs[i][0]);
        }
        System.out.println(log);

        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            Set<Integer> out = new HashSet<>();
            int a = queries[i] - x;
            int b = queries[i];

            for(int j = 0;j<logs.length;j++){
                if(logs[i][1] >= a && logs[i][1] <= b){
                    out.add(logs[j][0]);
                }
            }
            ans[i] = log.size() - out.size();

        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
