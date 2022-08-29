package com.company.dsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
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
    static boolean tree_present(String[][] trees,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(trees[i][j].equals("^")){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        /*
        int[] arr = {1,2,3,3,1};
        int max =max(arr);
        int[] freq = new int[max + 1];
        for(int e : arr){
            freq[e]++;
        }
        System.out.println(Arrays.toString(freq));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] ar = new String[1][4];
        String line = br.readLine();
        char[] ch = line.toCharArray();
        for(int i=0;i<4;i++){
            ar[0][i] = String.valueOf(ch[i]);
        }
        System.out.println(Arrays.deepToString(ar));
        System.out.println(tree_present(ar,1,4));


         */
        String ar = ".";
        ar = "^";
        System.out.println(ar);
    }
}
