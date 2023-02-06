package com.company.dsa.linked_list;

import java.util.List;

public class reverese {
    static void print(ListNode head){
        ListNode c = head;
        while(head.next != null){
            System.out.println(c.val);
            c = c.next;
        }
    }
}
