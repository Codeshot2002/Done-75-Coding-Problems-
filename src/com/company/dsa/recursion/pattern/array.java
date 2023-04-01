package com.company.dsa.recursion.pattern;

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
    static String removeA(String s, int i){
        if(i == s.length()) return

    }
    public static void main(String[] args) {
        int[] a ={1,2,3,5,10,15};
        System.out.println(sorted(a,1));
        System.out.println(lSearch(a,15,0));
        System.out.println(removeA("umang",0,""));
    }
}
