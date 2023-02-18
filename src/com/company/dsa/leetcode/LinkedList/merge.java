package com.company.dsa.leetcode.LinkedList;

import com.company.dsa.leetcode.LinkedList.ListNode;

import java.util.HashMap;
import java.util.Map;

public class merge {
    static ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        HashMap<ListNode, Integer> map = new HashMap<ListNode,Integer>();
        int count = 0;
        while(true){
            ListNode min = lists[0];
            for(int i=0;i<lists.length;i++){
                if(lists[i] == null){
                    map.put(lists[i], 1);
                    continue;
                }
                if(lists[i].val < min.val){         //replaces min with the smaller value node in the list
                    min = lists[i];
                }
            }
            for(Map.Entry<ListNode, Integer> entry : map.entrySet()){
                if(entry.getValue() == 0){
                    count ++;
                }
            }
            if(count == lists.length) break;
            tail.next = min;
            tail = tail.next;
        }
        return dummy.next;
    }
}
