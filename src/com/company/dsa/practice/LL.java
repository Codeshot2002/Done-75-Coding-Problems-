package com.company.dsa.practice;
<<<<<<< HEAD

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
=======
class Node{
    int data;
    Node next;
    Node(){}
    Node(int data){
        this.data = data;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
class Linked_list{
    Node head;
    boolean isCreated = false;
    int size = -1;
    void create(int data){
        head = new Node();
        Node node = new Node(data);
        head = node;
        node.next = null;
        isCreated = true;
        size = 1;
    }
    void insert(int data){
>>>>>>> origin/master
        if(size<0){
            create(data);
        }
        else{
<<<<<<< HEAD
            Node node = new Node();
            node.data = data;
=======
            Node node = new Node(data);
>>>>>>> origin/master
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = node;
            node.next = null;
<<<<<<< HEAD
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
=======
            size++;
        }
    }
    void delete(int location){
        if(location==0){
            Node curr = head.next;
            head = curr;
        }
        else if(location<size){
            Node current = head;
            for (int i = 0; i < location - 1; i++) {
                current = current.next;
            }
            Node prev = current;
            Node next = current.next.next;
            prev.next = next;
        }
        else{
            System.out.println("List has only " + size + " elements");
        }
    }
    void print(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + "->");
            current = current.next;
        }
    }
}
public class LL {
    static int rev(int a){
        int res = 0;
        while(a>0){
            res = res*10 + a%10;
            a = a/10;
        }
        return res;
    }
    static public Linked_list addTwoNumbers(Linked_list l1, Linked_list l2) {
        Node c1 = l1.head;
        Node c2 = l2.head;
        Linked_list res =  new Linked_list();
        int num1 = 0;
        int num2 = 0;
        while(c1!=null){
            num1 = num1*10 + c1.data;
            c1 = c1.next;
        }
        while(c2!=null){
            num2 = num2*10 + c2.data;
            c2 = c2.next;
        }
        int sum = num1+num2;
        while(sum!=0){
            res.insert(sum%10);
            sum /= 10;
        }
        return res;
    }
    public static void main(String[] args) {
        Linked_list list1 = new Linked_list();
        list1.insert(2);list1.insert(4);list1.insert(3);
        Linked_list list2 = new Linked_list();
        list2.insert(5);list2.insert(6);list2.insert(4);
        Linked_list res = addTwoNumbers(list1,list2);
        res.print();
>>>>>>> origin/master
    }
}
