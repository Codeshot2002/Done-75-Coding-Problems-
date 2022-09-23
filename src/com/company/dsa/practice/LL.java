package com.company.dsa.practice;
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
        if(size<0){
            create(data);
        }
        else{
            Node node = new Node(data);
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = node;
            node.next = null;
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
    }
}
