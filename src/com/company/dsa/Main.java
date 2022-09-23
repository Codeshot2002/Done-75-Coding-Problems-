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
    static boolean check(int[] a,int[] b){
        Queue<Integer> A =new LinkedList<>();
        Queue<Integer> B = new LinkedList<>();
        for(int i=0;i<a.length;i++){   //adding array into stacks
            A.add(a[i]);
            B.add(b[i]);
        }
        for(int i=0;i<a.length;i++){
            int card = A.remove();
            A.add(card);
            if(A.equals(B)) return true;
        }
        return false;
    }
    static boolean allSame(int[] a){
        int check = a[0];
        for(int i=0;i<a.length;i++){
            if(check!=a[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        int[] c = {1,1,1};
        System.out.println(allSame(c));
    }
}
