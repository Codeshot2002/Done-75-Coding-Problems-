package com.company.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class gnode{
    String name;
    int index;

    public gnode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
class mGraph{
    ArrayList<gnode> nodelist = new ArrayList<>();
    boolean[] isVisited;
    int[][] adjacent;

    public mGraph(ArrayList<gnode> nodelist) {
        this.nodelist = nodelist;
        adjacent = new int[nodelist.size()][nodelist.size()];
    }

    void directedEdge(int i, int j){
        adjacent[i][j] = 1;
    }
    void unDirectedEdge(int i,int j){
        adjacent[i][j] = 1;
        adjacent[j][i] = 1;
    }
    public ArrayList<gnode> getNeighbor(gnode node){
        ArrayList<gnode> neigbor = new ArrayList<>();
        int index = node.index;
        isVisited = new boolean[nodelist.size()];
        for(int i=0;i<adjacent.length;i++){
            if(adjacent[index][i] == 1){
                neigbor.add(nodelist.get(i));
            }
        }
        return neigbor;
    }
    public void  bfsVisit(gnode node,boolean[] isVisited){
        Queue<gnode> queue = new LinkedList<>();

        queue.add(node);
        while(!queue.isEmpty()){
            gnode n = queue.remove();
            System.out.println(n.name);
            isVisited[n.index] = true;
            ArrayList<gnode> neigbor = getNeighbor(n);
            for(int i=0;i<neigbor.size();i++){
                if(!isVisited[i]){
                    queue.add(neigbor.get(i));
                    isVisited[i] = true;
                }
            }
        }
    }
    public void bfs(){
        isVisited = new boolean[nodelist.size()];
        for(int i=0;i<nodelist.size();i++){
            if(!isVisited[i]){
                bfsVisit(nodelist.get(i),isVisited);
            }
        }
    }

}

public class adjacent_matrix {
    public static void main(String[] args) {
        ArrayList<gnode> nodelist =new ArrayList<>();
        nodelist.add(new gnode("A",0));
        nodelist.add(new gnode("B",1));
        nodelist.add(new gnode("C",2));
        nodelist.add(new gnode("D",3));
        nodelist.add(new gnode("E",4));

        mGraph graph = new mGraph(nodelist);
        graph.directedEdge(0,1);

        graph.directedEdge(1,2);
        graph.directedEdge(2,3);
        graph.directedEdge(3,0);
        graph.directedEdge(1,4);

        System.out.println("BFS TRAVERSAL");
        graph.bfs();
    }

}
