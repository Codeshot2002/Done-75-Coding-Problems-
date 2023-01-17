package com.company.dsa.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class valid_parentheses {
    static boolean isValid(String s){
        HashMap<Character,Character> par = new HashMap<>();
        par.put('(',')'); par.put('{','}'); par.put('[',']');
        Stack<Character> stack = new Stack<>();
        if(s.length() == 1) return false;
        for(int i=0;i<s.length();i++){
            if(par.containsKey(s.charAt(i))){     //if the char is opening bracket
                stack.push(s.charAt(i));
            }else{
                if(par.values().contains(s.charAt(i))){
                    if(!stack.isEmpty() && par.get(stack.peek()) == s.charAt(i)){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("(){}}{"));
    }
}
