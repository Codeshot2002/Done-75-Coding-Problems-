package com.company.dsa.practice;

import java.util.ArrayList;
import java.util.Arrays;

class Node{
    int data;
    Node next;
    Node (){}
    Node (int val){
        this.data = val;
    }
    Node(int val, Node next){
        this.data = val;
        this.next = next;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int size = -1;
    public void create(int data){
        head = new Node();
        tail = new Node();
        Node node = new Node();
        node.data = data;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }
    public void add(int data){
        if(size<0){
            create(data);
        }
        else{
            Node node = new Node();
            node.data = data;
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = node;
            node.next = null;
        }
    }
    public void printall(){
        Node curr = head;
        while(curr.next!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
}

public class LL {
    static int reverse(int num){
        int rev = 0;
        while(num!=0){
            int remain = num%10;
            rev = rev*10 + remain;
            num = num/10;
        }
        return rev;
    }
    static Node getSum(Node list1, Node list2){
        Node cur1 = list1;
        StringBuilder val1 = new StringBuilder();
        StringBuilder val2 = new StringBuilder();
        ArrayList<Integer> res = new ArrayList<>();
        while(cur1.next!= null){
            val1.append(Integer.toString(cur1.data));
            cur1 = cur1.next;
        }
        val1.append(Integer.toString(cur1.data));
        Node cur2 = list2;
        while(cur2.next!=null){
            val2.append(Integer.toString(cur2.data));
            cur2 = cur2.next;
        }
        val2.append(Integer.toString(cur2.data));
        String one = String.valueOf(val1);
        String two = String.valueOf(val2);
        int sum = Integer.parseInt(one) + Integer.parseInt(two);
        int answer = reverse(sum);
        String str = String.valueOf(answer);
        int len = Integer.toString(answer).length();
        int i =0;
        Node node1 = new Node(str.charAt(i));
        while(i<len-1){
            i++;
            Node node2 =  new Node();
            node2.data = str.charAt(i);
            node1.next = node2;
            node2.next = null;
        }
        return node1;
    }
    static void print(Node node){
        Node curr = node;
        while(curr.next!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
    public static void main(String[] args) {
        Node node1 = new Node(2);
        Node node12 = new Node(4);
        Node node13 = new Node(3);
        node1.next = node12;
        node1.next.next = node13;
        node1.next.next.next = null;
        Node node2 = new Node(5);
        Node node22 = new Node(6);
        Node node23 = new Node(4);
        node2.next = node22;
        node2.next.next = node23;
        node2.next.next.next = null;

        Node ans = getSum(node1,node2);
        print(ans);
    }
}
