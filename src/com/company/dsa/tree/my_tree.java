package com.company.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

class treeNode{

    int data;
    treeNode left;
    treeNode right;
    int height;
    public treeNode(){}
    public treeNode(int data){
        this.data = data;
    }
    public treeNode(int data, treeNode left, treeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
public class my_tree {
    static int max(treeNode node){
        treeNode test = node;
        int count = 0;
        while(test != null){
            test = test.left;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
