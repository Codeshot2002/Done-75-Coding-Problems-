package com.company.dsa.recursion.pattern;

import java.util.*;

public class array {
    //find if the array is sorted using recursion
    static boolean sorted(int[] ar,int n){
        if(ar[n] < ar[n-1]){
        return false;
        }
        if(n == ar.length-1) return true;

        return sorted(ar,n+1);
    }

    static boolean lSearch(int[] ar,int target,int i){
        if(i == ar.length ) return false;
        if(target == ar[i]) return true;
        return lSearch(ar,target,i+1);
    }
    static String removeA(String s, int i,String out){
        if(i == s.length()) return out;
        if(s.charAt(i) !='a') out += s.charAt(i);
        return removeA(s,i+1,out);
    }
    static void removeA2(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char c = up.charAt(0);
        if(c == 'a') removeA2(p,up.substring(1));
        else removeA2(p + c,up.substring(1));
    }

    static ArrayList<Integer> search(int[] ar, int target, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == ar.length) return list;
        if(ar[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> ans = search(ar,target,i+1);
        list.addAll(ans);
        return list;
    }
    static int bSearch(int[] ar,int target){
        int start = 0, end = ar.length-1;
        int mid = -1;
        while(start<end){
            mid = (start + end) / 2;
            if(ar[mid] == target) return mid;
            else if(target < ar[mid]){
                end = mid - 1;
            }
            else if(target > ar[mid]){
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] a ={1,2,3,5,10,15};
        System.out.println(sorted(a,1));
        System.out.println(lSearch(a,15,0));
        System.out.println(removeA("umang",0,""));
        String n = "umang";
        String p = "";
        String up = "aannd";
        removeA2(p,up);

        System.out.println();
        System.out.println(search(a,5,0));
        System.out.println(bSearch(a,4));
    }
}
