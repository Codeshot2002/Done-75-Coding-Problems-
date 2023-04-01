package com.company.dsa.tree;

public class test {
    static void trav(Node root){
        if(root == null) return;
        System.out.println(root.data);
        trav(root.left);
        trav(root.right);
    }
    public static void main(String[] args) {
        int n = 1;
        int count = 0;
        while(n>0){
            count++;
            n /=10;
        }
        System.out.println(count);
    }
}
