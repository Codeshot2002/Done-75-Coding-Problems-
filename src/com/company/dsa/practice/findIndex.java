package com.company.dsa.practice;

public class findIndex {
    static public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        int left = 0, right = n-1;
        while(left < h){
            System.out.println(haystack.substring(left,right+1));
            if(haystack.substring(left,right+1).equalsIgnoreCase(needle)){
                return left;
            }
            if(right != h-1){
                right++;
            }
            left++;
        }
        return -1;
    }
    static public String reverseWords(String s) {
        String out = "";
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        int len = s.length();
        int i = len;
        int j = len-1;
        while(j>=0){
            while(!Character.isWhitespace(s.charAt(j))){
                if(j>0) j--;
                else break;
            }
            out += s.substring(j,i);
            out += " ";
            i = j;
            j--;
        }
        out = out.replaceAll("\\s+", " ");
        return out.trim();
    }
    public static void main(String[] args) {
//        String haystack = "leetcode";
//        String needle = "leeto";
//        System.out.println(strStr(haystack,needle));
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
