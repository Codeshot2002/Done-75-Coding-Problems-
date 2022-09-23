package com.company.dsa.linked_list;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class remove_nth {
    static ListNode  removeNthFromEnd(ListNode head, int n){
        if(head.next==null){
            head = null;
        }
        else{
            ListNode current = head;
            int len = 0;
            while(current.next!=null) {
                current = current.next;
                len++;
            }
            if(n-1==len){
                head = head.next;
            }
            else {
                current = head;
                len -= n;
                for (int i = 0; i <= len - 1; i++) {
                    current = current.next;
                }
                System.out.println(current.next.val + " has been removed!");
                ListNode next = current.next.next;
                current.next = next;
            }
        }
        return head;
    }
    static void print(ListNode head){
        ListNode c = head;
        while(c!=null){
            System.out.print(c.val + "->");
            c = c.next;
        }
    }
    static ArrayList<Integer> getnums(ListNode node){
        ListNode c = node;
        ArrayList<Integer> num = new ArrayList<>();
        while(c!=null){
            num.add(c.val);
            c = c.next;
        }
        return num;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(10,new ListNode(20,new ListNode(30,new ListNode(40,new ListNode(50)))));
        print(a);
        System.out.println();
        ListNode b = removeNthFromEnd(a,5);
        print(b);
        System.out.println(getnums(b));
    }
}
