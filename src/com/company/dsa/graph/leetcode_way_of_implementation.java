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

    static public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        visited[0] = true;
        Stack<Integer> stack = new Stack<>();
        while(!stack.isEmpty()){
            int curr = stack.pop();
            System.out.println(curr);
            if(curr == n-1) return true;
            for(int nei : rooms.get(curr)){
                if(!visited[nei]){
                    stack.push(nei);
                    visited[nei] = true;
                }
            }
        }

        return false;
    }

    static void findAllPaths( int src, int dest,List<Integer>[] adj ,List<List<Integer>> ans, List<Integer> temp, boolean[] visited){
        if(src == dest){
            List<Integer> t = new ArrayList<>(temp);
            ans.add(t);
            return;
        }
        visited[src] = true;
        for(int nei : adj[src]){
            if(!visited[nei]){
                temp.add(nei);
                findAllPaths(nei,dest,adj,ans,temp,visited);
                temp.remove(temp.size()-1);
            }
        }
        visited[src] = false;
    }
    static List<Integer> shortest_path(List<List<Integer>> ans){
        List<Integer> out = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i).size() < min){
                out = ans.get(i);
                min = ans.get(i).size();
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[][] graph = {{1,2},{1,3},{1,4},{2,3},{2,5},{3,4},{4,5},{5,6}};
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
        //System.out.println("Graph : " + Arrays.toString(graph));
        System.out.println("dfs");
        System.out.println(dfsTraversal(graph,adj));
        System.out.println("bfs");
        System.out.println(bfsTraversal(graph,adj));

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[7];
        temp.add(1);
        System.out.println("All paths");
        findAllPaths(1,6,adj,ans,temp,visited);
        System.out.println(ans);
        System.out.println("Shortest path");
        System.out.println(shortest_path(ans));
    }
}
