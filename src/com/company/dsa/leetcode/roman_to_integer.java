package com.company.dsa.leetcode;

import java.util.HashMap;

public class roman_to_integer {
    static int romanToInt(String s){
        HashMap<Character, Integer> symbols = new HashMap<>();
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);

        int out = 0;
        for(int i=0;i<s.length();i++){
            if(i< s.length() - 1){
                if(symbols.get(s.charAt(i)) < symbols.get(s.charAt(i+1))){
                    out += symbols.get(s.charAt(i+1)) - symbols.get(s.charAt(i));
                    i++;
                }
                else{
                    out += symbols.get(s.charAt(i));
                }
            }
            else{
                out += symbols.get(s.charAt(i));
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
