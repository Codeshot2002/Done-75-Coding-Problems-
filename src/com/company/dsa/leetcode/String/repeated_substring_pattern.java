package com.company.dsa.leetcode.String;

public class repeated_substring_pattern {
    static public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        int i = len/2;
        int n = 2;
        while(i>0){
            String temp = s.substring(0,i);
            String check = "";
            for(int j=0;j<n-1;j++){
                check += temp;
            }
            if(check.equals(s)){
                return true;
            }
            i = i/2;
            i = i+1;
            n *= 2;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("ababab"));
    }
}
