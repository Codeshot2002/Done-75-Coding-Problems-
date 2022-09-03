package com.company.dsa.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class weights {
    static boolean traverse_once(int[] arr, int w){
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == w) return true;
        }
        return false;
    }
    static boolean traverse_double(int[] arr, int w){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(w == arr[i] + arr[j])return true;
            }
        }
        return false;
    }
    static String check(int w,int x,int y,int z){
        int[] arr = {x,y,z};
        if(x+y+z == w) return "YES";
        else if(traverse_once(arr,w)) return "YES";
        else if(traverse_double(arr,w)) return "YES";
        else return "NO";
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String[] input = br.readLine().trim().split(" ");
            int w = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            int y = Integer.parseInt(input[2]);
            int z = Integer.parseInt(input[3]);
            System.out.println(check(w,x,y,z));
        }
    }
}
