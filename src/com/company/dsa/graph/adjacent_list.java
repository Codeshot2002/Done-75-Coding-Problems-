package com.company.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class graphNode{
    String name;
    int index;
    ArrayList<graphNode> neighbor = new ArrayList<>();
    boolean isVisited = false;
    graphNode(String name, int index){
        this.name = name;
        this.index = index;
    }
}

class mygraph {
    ArrayList<graphNode> nodelist = new ArrayList<>();
    mygraph(ArrayList<graphNode> nodelist){
        this.nodelist = nodelist;
    }

    public void directedEdge(int i, int j){
        nodelist.get(i).neighbor.add(nodelist.get(j));
    }

    public void undirectedEdge(int i, int j){
        nodelist.get(i).neighbor.add(nodelist.get(j));
        nodelist.get(j).neighbor.add(nodelist.get(i));
    }

    //BFS traversal also known as level order traversal
    public void bfsVisit(graphNode node){
        Queue<graphNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            graphNode n =  queue.remove();
            System.out.print(n.name + "->");
            n.isVisited = true;
            ArrayList<graphNode> neighbor = n.neighbor;
            for(graphNode x : neighbor){
                if(!x.isVisited){
                    queue.add(x);
                    x.isVisited = true;
                }
            }
        }
    }
    public void bfs(){
        for(graphNode node : nodelist){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }
    void print(){
        for(int i=0;i<nodelist.size();i++){
            graphNode node = nodelist.get(i);
            System.out.print(node.name + " : ");
            for(int j=0;j<node.neighbor.size();j++){
                System.out.print(node.neighbor.get(j).name);
            }
            System.out.println();
        }
    }


}

public class adjacent_list {
    public static void main(String[] args) {
        ArrayList<graphNode> nodelist =new ArrayList<>();
        nodelist.add(new graphNode("A",0));
        nodelist.add(new graphNode("B",1));
        nodelist.add(new graphNode("C",2));
        nodelist.add(new graphNode("D",3));
        nodelist.add(new graphNode("E",4));

        mygraph graph = new mygraph(nodelist);
        graph.directedEdge(0,1);

        graph.directedEdge(1,2);
        graph.directedEdge(2,3);
        graph.directedEdge(3,0);
        graph.directedEdge(1,4);

        System.out.println("Neighbor");
        graph.print();
        System.out.println();
        System.out.println("BFS TRAVERSAL");
        graph.bfs();
    }
}
