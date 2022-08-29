package com.company.dsa.facebook_hackercuo.B1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class second_hands {
    public static int max(int[] arr){
        if(arr.length>0){
            int num = arr[0];
            for(int i=0;i<arr.length;i++){
                if(num<arr[i]){
                    num = arr[i];
                }
            }
            return num;
        }
        else{
            return -1;
        }
    }
    public static String secondHand(int N, int K, int[] parts){
        int cap = 2*K;
        if(N>cap){
            return "NO";
        }
        else{
            int max = max(parts);
            int[] freq = new int[max + 1];
            for(int e : parts){
                freq[e]++;
            }
            for(int i=0;i<freq.length;i++){
                if(freq[i] > 2){
                    return "NO";
                }
            }
            return "YES";
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int j = 1;
        while(t-- > 0){
            String[] arr1 = br.readLine().split(" ");
            String[] parts = br.readLine().split(" ");
            int n = Integer.parseInt(arr1[0]);
            int k = Integer.parseInt(arr1[1]);
            int[] part = new int[parts.length];
            for(int i=0;i<parts.length;i++){
                part[i] = Integer.parseInt(parts[i]);
            }

            System.out.println("Case #" + j + ": " + secondHand(n,k,part));
            j++;
        }
    }
}
