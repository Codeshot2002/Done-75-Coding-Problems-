package com.company.dsa.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class weighted_graph {

    public static void main(String[] args) {
        int[][] graph = {{1,2,10},{1,3,20},{2,3,15}};
        int v = graph.length;
        ArrayList<Integer>[] adj = new ArrayList[v+1];
        for(int i=0;i<=v;i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] edge : graph){
            int first = edge[0];
            int sec = edge[1];
            int weight = edge[2];
            adj[first].add(sec);
            adj[sec].add(first);
        }
        System.out.println(Arrays.deepToString(adj));
    }
}
