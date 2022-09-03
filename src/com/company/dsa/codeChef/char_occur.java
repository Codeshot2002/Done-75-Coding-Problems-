package com.company.dsa.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class char_occur {
    static int check(String[] input){
        int count = 0;
        for(int i=0;i<input.length;i++){
            if(input[i].equalsIgnoreCase("4")){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String[] input = br.readLine().split("");
            System.out.println(check(input));
        }
    }
}
