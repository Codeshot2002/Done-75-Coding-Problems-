package com.company.dsa.round_1;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class a2 {
    static boolean duplicacy(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j])return true;
            }
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
    static boolean check(int[] a,int[] b){  //check if the values after re ordering are same or not
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
    static String func(int[] a, int[] b, int n, int k){
        if(Arrays.equals(a,b)){
            if(n==2){
                if(allSame(a)) return "YES";
                else{
                    if(k%2==0) return"YES";
                    else return "NO";
                }
            }
            else{
                if(allSame(a)) return "YES";
                else{
                    if(k>=2 || k==0) return"YES";
                    else return "NO";
                }
            }
        }
        if(!Arrays.equals(a,b)){
            if(k==0) return "NO";
            if(check(a,b)){
                if(n==2){
                    if(k%2==1) return"YES";
                    else return "NO";
                }
                if(k>=1) return"YES";
                else return "NO";
            }
        }
        return "NO";
    }
    public static void main(String[] args)throws IOException {
        String location = "F:\\DSA with java course\\Round1_meta_hackercup\\A2";
        String input_filename = "input";
        BufferedWriter bw = new BufferedWriter(new FileWriter(location + "\\output.txt"));
        BufferedReader br = new BufferedReader(new FileReader(location + "\\" + input_filename + ".txt"));
        int t = Integer.parseInt(br.readLine());
        int cou = 1;
        while(t-- > 0){
            String[] first = br.readLine().split(" ");
            String[] arrayA = br.readLine().split(" ");
            String[] arrayB = br.readLine().split(" ");
            int n = Integer.parseInt(first[0]);
            int k = Integer.parseInt(first[1]);
            int[] a = new int[arrayA.length];
            int[] b = new int[arrayB.length];
            for(int i=0;i<a.length;i++){
                a[i] = Integer.parseInt(arrayA[i]);
                b[i] = Integer.parseInt(arrayB[i]);
            }

            bw.write("Case #" + cou + ": " +func(a,b,n,k) +  "\n");
            System.out.println("Case #" + cou + ": " +func(a,b,n,k) +  "\n");
            cou++;
        }
        bw.close();
        br.close();
    }
}
