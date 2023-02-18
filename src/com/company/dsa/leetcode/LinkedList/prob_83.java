package com.company.dsa.leetcode.LinkedList;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class prob_83 {
    static void print(ListNode head){
        ListNode c = head;
        while(c!=null){
            System.out.print(c.val + "->");
            c = c.next;
        }
    }
    static LinkedHashSet<Integer> convert(ListNode head){
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        ListNode c = head;
        while(c!=null){
            hs.add(c.val);
            c = c.next;
        }
        return hs;
    }
    static ListNode deleteduplicates(ListNode head){
        LinkedHashSet<Integer> h = convert(head);
        Iterator<Integer> it = h.iterator();
        int len = h.size();
        ListNode a = new ListNode();
        return a;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1,new ListNode(1, new ListNode(3, new ListNode(3))));
        print(node1);
        System.out.println();
        System.out.println(convert(node1));
    }
}
