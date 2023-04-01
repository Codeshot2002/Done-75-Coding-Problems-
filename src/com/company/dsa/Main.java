package com.company.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    static String sol(String s1){
        String[] ar = s1.split(" ");
        String out = "";
        for(int i = ar.length-1;i>=0;i--){
            out += ar[i];
            if(i != 0) out += " ";
        }
        return out;
    }
    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;
        List<char[]> head = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            char[] child = new char[s.length()*2];
            head.add(child);
        }
        int a = 0;
        boolean up = true;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            head.get(a)[i] = c;
            if(up && a < numRows){
                if(a == numRows - 1){
                    up = false;
                }else{
                    a++;
                }
            }
            if(!up && a >= 0){
                if(a == 0){
                    up = true;
                }else{
                    a--;
                }
            }
        }
        StringBuilder out = new StringBuilder();
        for(int i=0;i<head.size();i++){
            for(int j=0;j<s.length()*2;j++){
                char c = head.get(i)[j];
                if(c >= 65 && c <= 122){
                    out.append(head.get(i)[j]);
                }
            }
        }
        return out.toString();
    }
    public static int myAtoi(String s) {
        String num = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '-') num += c;
            if(c >= 49 && c <= 57){
                num += c;
            }
        }
        return Integer.parseInt(num);
    }
    public static void main(String[] args) {
        System.out.println(convert("ABCDEFGH",2));
        System.out.println(myAtoi("words and 987"));

    }
}
