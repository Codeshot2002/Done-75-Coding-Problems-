package com.company.dsa.leetcode.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class duplicate_words {
    static String func(String l){
        String[] words = l.split(" ");
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].equalsIgnoreCase(words[j])){
                    words[j] = "";
                }
            }
        }
        String res = "";
        for(int j=0;j<words.length;j++){
            if(!words[j].equals("")){
                res += words[j];
                if(j<words.length-1){
                    res += " ";
                }
            }
        }
        return res;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >  0){
            String line = br.readLine();
            System.out.println(func(line));
        }
    }
}
