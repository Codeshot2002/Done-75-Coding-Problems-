package com.company.dsa.practice;

import java.util.Arrays;

public class decode {
    static String reverseStr(String pat, int start, int end){
        StringBuilder str = new StringBuilder(pat.substring(start,end + 1));
        str.reverse();
        String out = pat.substring(0,start);
        out += str;
        return out;
    }
    static String swap(String in, int i){
        char[] ar = in.toCharArray();
        char temp = ar[i];
        ar[i] = ar[i+1];
        ar[i+1] = temp;
        return String.valueOf(ar);
    }
    static int calK(String pat, int i){
        int c =0;
        for(int start=i;start<pat.length();start++){
            if(pat.charAt(start) == 'D'){
                c++;
            }
            if(pat.charAt(start) == 'I') return c;
        }
        return c;
    }
    public static String smallestNumber(String pattern) {
        int n = pattern.length() + 1;
        String ans = "";
        for(int i=1;i<=n;i++){
            ans += i;
        }
        for(int i=0;i<n-1;i++){
            if(pattern.charAt(i) == 'D'){
                int no = calK(pattern,i);
                System.out.println(no);
                if(no == 1){
                    ans = swap(ans,i);
                }else{
                    ans = reverseStr(ans,i,i+no);
                }
                i += no;
            }
        }
        return ans;
    }
public static void main(String[] args) {
    System.out.println(smallestNumber("IIIDIDDD"));
}
}
