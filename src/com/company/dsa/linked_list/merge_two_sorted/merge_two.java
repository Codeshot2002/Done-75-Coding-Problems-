package com.company.dsa.linked_list.merge_two_sorted;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class merge_two {
    static ArrayList<Integer> getnums(ListNode node){
        ListNode c = node;
        ArrayList<Integer> num = new ArrayList<>();
        while(c!=null){
            num.add(c.val);
            c = c.next;
        }
        return num;
    }
    static void insert(ListNode head, int data){
        ListNode node = new ListNode();
        node.val = data;
        ListNode current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = node;
        node.next = null;
    }
    static ArrayList<Integer> merge(ArrayList<Integer> num1,ArrayList<Integer> num2){
        ArrayList<Integer> res = new ArrayList<>();
        int len1 = num1.size();
        int len2 = num2.size();
        int i,j;
        i = j = 0;
        while(i<len1 && j<len2){
            if(num1.get(i) < num2.get(j)){
                res.add(num1.get(i));
                i++;
            }
            else{
                res.add(num2.get(j));
                j++;
            }
        }
        while(i<len1){
            res.add(num1.get(i));
            i++;
        }
        while(j<len2){
            res.add(num2.get(j));
            j++;
        }
        return res;
    }
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> a = getnums(list1);
        ArrayList<Integer> b = getnums(list2);
        ArrayList<Integer> res = merge(a,b);
        System.out.println(a +  "\n" + b);
        if(res.size()>0){
            ListNode result = new ListNode(res.get(0));
            for(int i=1;i<res.size();i++){
                insert(result,res.get(i));
            }
            return result;
        }else{
            ListNode an = new ListNode();
            an = null;
            return an;
        }
    }
    static void print(ListNode head){
        ListNode c = head;
        while(c!=null){
            System.out.print(c.val + "->");
            c = c.next;
        }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode b = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode res = mergeTwoLists(a,b);
        print(res);
    }
}
