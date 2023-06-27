package com.company.dsa.recursion.pattern;

import java.util.*;

public class subsets {
    static void sub(String p, String up,List<String> res){
        if(up.isEmpty()){
            if(!p.isEmpty()) res.add(p);
            return;
        }
        char c = up.charAt(0);
        sub(p + c,up.substring(1),res);
        sub(p,up.substring(1),res);
    }
    static ArrayList<String> subset(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char c = up.charAt(0);
        ArrayList<String> left = subset(p + c,up.substring(1));
        ArrayList<String> right = subset(p, up.substring(1));
        left.addAll(right);
        return left;
    }

    //iterative way for subsets
    public static List<List<Integer>> subsetI(int[] ar){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : ar){
            int n = outer.size();
            for(int j=0;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                if(!internal.isEmpty()){
                    int last = internal.get(internal.size()-1);
                    if(last == 1){
                        if(num == 2){
                            internal.add(num);
                        }
                    }else if(last == 2){
                        if(num != 2){
                            internal.add(num);
                        }
                    }else if(last == 3){
                        if(num != 2){
                            internal.add(num);
                        }
                    }
                }else{
                    internal.add(num);
                }
                outer.add(internal);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        int[] ar = {1,1,2,2,2,2,2,3};
        List<List<Integer>> list = subsetI(ar);
        int max = -1;
        for(int i=0;i<list.size();i++){
            max = Math.max(max,list.get(i).size());
        }
        System.out.println(max);
    }
}
