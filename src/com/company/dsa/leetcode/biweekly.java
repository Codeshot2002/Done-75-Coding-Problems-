package com.company.dsa.leetcode;

import java.awt.*;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class biweekly {
            static boolean reverse(String a, String b){
                StringBuilder str = new StringBuilder();
                str.append(b);
                str.reverse();
                b = String.valueOf(str);
                if(b.equals(a)) return true;
                else return false;
            }
            public static int maximumNumberOfStringPairs(String[] words) {
                ArrayList<String> pair = new ArrayList<>();
                for(String x : words){
                    pair.add(x);
                }
                int c = 0;
                for(int i=0;i<words.length;i++){
                    for(int j=i+1;j<words.length;j++){
                        if(reverse(words[i], words[j])){
                            c++;
                            break;
                        }
                    }
                }
                return c;
            }

    static public int minimizeConcatenatedLength(String[] words) {
        PriorityQueue<String> q = new PriorityQueue<>();
        for(String x : words){
            q.add(x);
        }
        StringBuilder ans = new StringBuilder();
        while(!q.isEmpty()){
            if(ans.length() != 0 ){
                String temp = q.remove();
                if(ans.charAt(ans.length()-1) == temp.charAt(0) || ans.charAt(ans.length()-1) == temp.charAt(temp.length()-1)){
                    ans.append(temp.substring(1));
                }else{
                    ans.append(temp);
                }
            }else{
                ans.append(q.remove());
            }
        }
        return ans.length();
    }

    public static void main(String[] args) {

//        String[] ar = {"cd", "ac", "dc", "ca", "zz"};
//        System.out.println(maximumNumberOfStringPairs(ar));
        String[] ar2 = {"aaa","c","aba"};
        System.out.println(minimizeConcatenatedLength(ar2));
    }
}
