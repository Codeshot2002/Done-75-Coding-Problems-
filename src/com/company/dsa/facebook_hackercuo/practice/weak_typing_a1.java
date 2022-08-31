package com.company.dsa.facebook_hackercuo.practice;

import java.io.*;
import java.util.ArrayList;

public class weak_typing_a1 {
    static int sol(String[] words, int len){
        int f = 0;
        if(len>1){
            ArrayList<Integer> arr=  new ArrayList<>();
            for(int i=0;i<len;i++){
                if(words[i].equals("X")) arr.add(1);
                else if(words[i].equals("O")) arr.add(0);
            }
            for(int i=0;i<arr.size();i++){
                for(int k=i+1;k<arr.size();k++){
                    if(arr.get(i) != arr.get(k)){
                        f++;
                        i = k;
                    }
                }
            }
            return f;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        String location = "";
        String input_filename = "";
        BufferedWriter bw = new BufferedWriter(new FileWriter(location + "\\output.txt"));
        BufferedReader br = new BufferedReader(new FileReader(location + "\\" + input_filename));
        int t = Integer.parseInt(br.readLine());
        int i = 1;
        while(t-- > 0){
            int len = Integer.parseInt(br.readLine());
            String[] words = br.readLine().split("");
            bw.write("Case #" + (i++) + ": " + sol(words,len) + "\n");
        }
        bw.close();
    }
}
