package com.company.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class p1 {
    public static void main(String[] args) {
       String name = "Umang";
       String p = "";
       skip(p, name);
        System.out.println(removeDuplicate(name));
        System.out.println(checkAnagram("aab","baa"));
        System.out.println(checkpalindrome("aba"));
        System.out.println(name.substring(0,2));
    }

    static boolean checkpalindrome(String s){
        String s2 = "";
        for(int i=s.length()-1;i>=0;i--){
           s2 += s.charAt(i);
        }
        System.out.println(s2);
        if(s.equalsIgnoreCase(s2.toString())) return true;
        else return false;
    }

    static boolean checkAnagram(String s1, String s2) {
        int st1 = 0; int st2 = 0;
        for(int i=0;i<s1.length();i++){
            st1 += s1.charAt(i);
        }
        for(int i=0;i<s2.length();i++){
            st2 += s2.charAt(i);
        }
        if(st1 == st2) return true;
        else return false;
    }
    static String removeDuplicate(String s){
        Set<Character> output = new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            output.add(s.charAt(i));
        }
        return String.valueOf(output);
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p + ch, up.substring(1));
        }
    }
}
