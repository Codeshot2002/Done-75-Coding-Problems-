package com.company.dsa.practice;

import com.sun.source.tree.Tree;

import java.util.*;

public class pract {
    public static int repeatedStringMatch(String a, String b) {
        int a1 = a.length();
        int b1 = b.length();

        String newA = "";
        int times  =  (b1/a1) * 2;
        for(int i=0;i<times;i++){
            newA += a;
            int res = newA.indexOf(b);
            if(res >= 0) return i;
        }
        return -1;


    }
    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ar = new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            List<Integer> pat = new ArrayList<>();
            ar.add(true);
            for(int j=0;j<pattern.length();j++){
                int index = (queries[i].indexOf(pattern.charAt(j)));
                if(index >= 0){
                    pat.add(index);
                    int n = pat.size();
                    if(n >= 2){
                        if(pat.get(n-1) < pat.get(n-2)) {
                            ar.set(i,false);
                            break;
                        }
                    }
                }else{
                    ar.set(i,false);
                    break;
                }
            }
        }
        return ar;
    }
    public static void main(String[] args) {
//        String s = "aaaaaaa";
//        String[] wordDict = {"aaaa","aaa"};
//        System.out.println(wordBreak(s,wordDict));'
        String[] que = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pat = "FoBa";
        System.out.println(camelMatch(que,pat));

        Set<String> set = new LinkedHashSet<>();
        Map<Integer,String> sm = new TreeMap<>();
        sm.put(2,"Umang");
        sm.put(3,"Nitin");
        sm.put(1,"Ipsit");
        for(int x : sm.keySet()){
            if(sm.get(x).equalsIgnoreCase("umang")){
                System.out.println(x);
            }
        }

        for(Map.Entry<Integer,String> map : sm.entrySet()){
            System.out.println("Key : " + map.getKey() + "\nValue : " + map.getValue());
            System.out.println("-----------");
        }
    }
    public static boolean wordBreak(String s, String[] wordDict) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String x : wordDict){
            map.put(x,1);
        }
        boolean flag = false;
        int i = 1;
        while(s.length() > 0 && i <= s.length()){
            String temp = s.substring(0,i);
            if(map.containsKey(temp)){
                s = s.substring(i);
                i = 0;
                flag = true;
            }else flag = false;
            i++;
        }
        return flag;
    }




    static String helper(String p, String up){
        if(up.length() == 0){
            System.out.println(p);
            return p;
        }

        char c = up.charAt(0);
        //if it is char
        if(Character.isLetter(c)){
            return helper(p + c,up.substring(1));
        }
        //if it is digit
        else if(Character.isDigit(c)){
            int n = Integer.parseInt(String.valueOf(c));
            for(int i=0;i<n;i++){
                return helper(p,up.substring(2));
            }
        }else{
            return helper(p,up.substring(1));
        }

        return p;
    }
}
