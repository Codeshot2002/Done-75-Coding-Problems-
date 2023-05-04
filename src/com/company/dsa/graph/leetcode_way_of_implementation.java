package com.company.dsa.graph;
import java.util.*;

/*In this practice file I implemeneted the following things :-
1) DFS
2) BFS
3) Adjacency matrix to adjacency list

 */
public class leetcode_way_of_implementation {
    public static List<Integer> dfsTraversal(int[][] graph,ArrayList<Integer>[] adj){
        Stack<Integer> stack = new Stack<>();
        List<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[graph.length+1];
        stack.push(graph[0][0]);
        while(!stack.isEmpty()){
            int curr = stack.pop();
            dfs.add(curr);
            visited[curr] = true;
            for(int nei : adj[curr]){
                if(!visited[nei]){
                    stack.push(nei);
                    visited[nei] = true;
                }
            }
        }
        return dfs;
    }

    public static List<Integer> bfsTraversal(int[][] graph, ArrayList<Integer>[] adj){
        List<Integer> dfs = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.length+1];
        queue.add(graph[0][0]);
        visited[graph[0][0]] = true;
        while(!queue.isEmpty()){
            int curr = queue.remove();
            dfs.add(curr);
            for(int nei : adj[curr]){
                if(!visited[nei]){
                    queue.add(nei);
                    visited[nei] = true;
                }
            }
        }
        return dfs;
    }

    public static void main(String[] args) {
        int[][] graph = {{1,2},{2,3},{3,4},{4,1}};
        int v = graph.length;
        ArrayList<Integer>[] adj = new ArrayList[v+1];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<=v;i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] edge : graph){
            int first = edge[0];
            int sec = edge[1];
            adj[first].add(sec);
            adj[sec].add(first);
            map.computeIfAbsent(first, val -> new ArrayList<Integer>()).add(sec);
            map.computeIfAbsent(sec, val -> new ArrayList<Integer>()).add(first);
        }
        System.out.println("Graph in hashmap");
        System.out.println(map);
        System.out.println("Graph : " + Arrays.toString(graph));
        System.out.println("dfs");
        System.out.println(dfsTraversal(graph,adj));
        System.out.println("bfs");
        System.out.println(bfsTraversal(graph,adj));
    }
}
