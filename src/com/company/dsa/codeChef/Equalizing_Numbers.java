package com.company.dsa.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Equalizing_Numbers {
    static String func(int a,int b,int limit){
        if(a == b) return "YES";
        else {
            for(int i=1;i<=limit;i++){
                if((a+i) == (b-i)) return "YES";
                if((a-i) == (b+i)) return "YES";
            }
            return "NO";
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String[] input = br.readLine().trim().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            System.out.println(func(a,b,1000));
        }
    }
}
