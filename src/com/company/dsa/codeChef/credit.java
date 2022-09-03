package com.company.dsa.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class credit {
    static int sol(int n,int a,int b){
        int total = 360 + (2*n);
        int extra = a + b;
        total -= extra;
        if(total>=0){
            return total;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String[] ar = br.readLine().split(" ");
            int n = Integer.parseInt(ar[0]);
            int a = Integer.parseInt(ar[1]);
            int b = Integer.parseInt(ar[2]);
            System.out.println(sol(n,a,b));
        }
    }
}
