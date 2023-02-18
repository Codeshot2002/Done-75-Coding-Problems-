package com.company.dsa.linked_list;
class Node{
    int data;
    Node next;
    Node(){}
    Node(int data) {this.data = data;}
}
class singly_linked_list{
    Node head;
    Node tail;
    int size;

    public void create(int data){
        head = new Node();
        tail = new Node();
        Node node = new Node(data);
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }
    public void add(int data){
        Node node = new Node(data);
        if(size == 0){
            create(data);
        }
        else if(size == 1){
            head.next = node;
            size++;
            node.next = null;
            tail = node;
        }
        else{
            //traverse it to the end
            Node current = tail;
            current.next = new Node(data);
            node.next = null;
            tail = node;
            size++;
        }
    }
    public void print(){
        Node current = head;
        while(current.next != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println(current.data);
    }
    public void delete(int location){
        if(location == 0) head = head.next;
        if(location >= size){
            System.out.println("Number out of index!");
            return;
        }
        Node c1 = head;
        Node c2 = head;
        for(int i=0;i<location-1;i++){
            c1 = c1.next;
        }
        for(int i=0;i<location+1;i++){
            c2 = c2.next;
        }
        c1.next = c2;
    }
}
public class ll {
    public static void main(String[] args) {
        singly_linked_list sList = new singly_linked_list();
        sList.add(1);
        sList.add(2);
        sList.add(3);
        sList.print();
        sList.delete(0);
        sList.print();
    }
}

