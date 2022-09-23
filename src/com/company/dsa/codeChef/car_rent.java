package com.company.dsa.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class car_rent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            int km = Integer.parseInt(br.readLine());
            if(km<=300){
                System.out.println(3000);
            }
            else{
                System.out.println(km*10);
            }
        }
    }
}
