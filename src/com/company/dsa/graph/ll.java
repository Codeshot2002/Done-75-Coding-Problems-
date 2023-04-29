package com.company.dsa.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ll {
    public static void main(String[] args) {
        int[][] graph = {{1,2},{2,3},{2,4}};
        HashMap<Integer, List<Integer>> g = new HashMap<>();
        for(int[] e : graph){
            g.computeIfAbsent(e[0],val ->  new ArrayList<Integer>()).add(e[1]);
            g.computeIfAbsent(e[1],val ->  new ArrayList<Integer>()).add(e[0]);
        }
        System.out.println(g);
    }
}
