package com.company.dsa.recursion.pattern;
import java.util.*;
public class permutations {
    static void permute(String p, String up,ArrayList<String> res){
        if(up.isEmpty()){
            res.add(p);
            return;
        }
        char c = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permute(f + c + s,up.substring(1),res);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        permute("","abc",list);
        System.out.println(list);
        System.out.println("Size : " + list.size());
    }
}
