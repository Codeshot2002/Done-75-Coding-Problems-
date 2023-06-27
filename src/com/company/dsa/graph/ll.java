package com.company.dsa.graph;

import java.util.*;

public class ll {
    static public List<Integer> dfs(int[][] graph, HashMap<Integer, List<Integer>> g,int n){
        boolean[] isVisited = new boolean[n+1];
        List<Integer> ans = new ArrayList<>();
        int source = 1;
        int destination = 4;
        isVisited[source] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        ans.add(source);

        while(!queue.isEmpty()){
            int c = queue.remove();
            if(c == destination){
                break;
            }
            List<Integer> neighbor = g.get(c);
            int nearest = neighbor.get(0);
            for(int i=0;i<neighbor.size();i++){
                int nei = neighbor.get(i);
                if(nei < destination){
                    nearest = neighbor.get(i);
                }
            }
            queue.add(nearest);
            ans.add(nearest);
        }
        return ans;
    }

    static List<List<Integer>> all_path_finder(int[][] graph){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(graph[0][0],graph,temp,ans);
        return ans;
    }
    public static void dfs(int i, int[][] graph, List<Integer> temp,List<List<Integer>> ans){
        temp.add(i);
        if(i == graph.length-1){
            List<Integer> out = temp;
            ans.add(temp);
            return;
        }
        int[] child = graph[i];
        for(int node : child){
            dfs(node,graph,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        int[][] graph = {{2},{1,3},{2,4},{5,6},{4},{4}};

        HashMap<Integer, List<Integer>> g = new HashMap<>();
        for(int[] e : graph){
            g.computeIfAbsent(e[0],val ->  new ArrayList<Integer>()).add(e[1]);
            g.computeIfAbsent(e[1],val ->  new ArrayList<Integer>()).add(e[0]);
        }
        System.out.println(g);
        System.out.println(all_path_finder(graph));
    }
}
