package com.company.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node <T>{
     T data;
     Node(){}
     Node(T data){
         this.data = data;
     }
     Node(T data, Node left,Node right){
         this.data = data;
         this.left = left;
     }
     Node left,right;
     int height;
}
class tree{
    Node root;
    public tree(Node root){
        this.root = root;
    }
    public void preOrder(Node node){
        if(node == null) return;
        else{
            System.out.println(node.data + "-");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node present = queue.remove();
            System.out.println(present.data);
            if(present.left != null) queue.add(present.left);
            if(present.right != null) queue.add(present.right);
        }
    }
    String search(Node root, String search){
        int level = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node present = queue.remove();
            String data = (String)present.data;
            if(data.equalsIgnoreCase(search)) {
                return search + " node is present at " + level + " level";
            }
            if(present.left != null) queue.add(present.left);
            if(present.right != null) queue.add(present.right);
            level++;
        }
        return "Not found!";
    }

    <T> String delete(T search){
        int level = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node present = queue.remove();
            if(present.left != null) {
                if (present.left.data == search) {
                    return search + " node is present at " + level + " level";
                }else {
                    queue.add(present.left);
                }
            }
            if(present.right.data == search) {
                return search + " node is present at " + level + " level";
            }

            if(present.right != null) queue.add(present.right);
            level++;
        }
        return "Not found!";
    }

    <T> void add(T data){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node node = new Node(data);
        while(!queue.isEmpty()){
            Node present = queue.remove();
            if(present.left == null) {
                present.left = node;System.out.println(node.data + " has been added to the left of " + present.data);
                return;

            }
            else queue.add(present.left);

            if(present.right == null) {
                present.right = node;System.out.println(node.data + " has been added to the right of " + present.data);
                return;
            }
            else queue.add(present.right);
        }
    }
}
public class myTree {
    static int a =0;

    public myTree(Node<Integer> root) {
    }

    public static void main(String[] args) {
        Node root = new Node("Drinks");
        tree mytree = new tree(root);

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            System.out.print("Name of the node you want to add : ");
            String n = sc.next();
            mytree.add(new Node(n));
        }
        //mytree.preOrder(root);
        mytree.levelOrder(root);
        System.out.println(a);
    }
}
