package com.company.dsa.leetcode.LinkedList;

public class remove_nth_fromLast {

    static ListNode removeNthFromEnd(ListNode head, int n){
        if(head.next == null){
            head = null;
        }
        ListNode slow = head;
        ListNode fast = head;
        //this will iterate the fast pointer n times ahead of slow pointer
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = fast;
        return head;
    }
    static void print(ListNode head){
        ListNode c = head;
        while(c.next != null){
            System.out.println(c.val);
            c = c.next;
        }
    }
    public static void main(String[] args) {
        
    }
}
