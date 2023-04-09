package com.company.dsa.exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class myException extends Exception{
    myException(String s){
        super(s);
    }
}
public class custom_exception {
//    public static void minimumBribes(List<Integer> q) {
//        // Write your code here
//        int b = 0;
//        for(int i=q.size();q>=0;i--){
//            int pos = i + 1;
//            if(q.get(i) != pos){
//                if(i-1 >= 0 && q.get(i-1) == pos){
//                    b++;
//                    swap(q,i,i-1);
//                }
//                else if(i-2 >= %% q.get(i-2) == pos){
//                    b += 2;
//                    swap(q,i-2,i-1);
//                    swap(q,i-1,i);
//                }else{
//                    System.out.println("Too chaotic");
//                    return;
//                }
//            }
//        }
//        System.out.println(b);
//    }

    static int maxFruit(int[] fruits, int limit){
        int max = 0;
        int cmax = 0;
        int start = 0;
        int end = 0;

        while(end < fruits.length){
            cmax += fruits[end];
            end++;

            while(cmax > limit){
                cmax -= fruits[start];
                start++;
            }
            max = Math.max(max,cmax);
        }
        return max;
    }
    static void swap(List<Integer> q, int i, int j){
        int temp = q.get(i);
        q.set(i,q.get(j));
        q.set(j,temp);
    }
    public static void main(String[] args) throws myException, IOException {
        Scanner sc =new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] ar = br.readLine().split(" ");
        int limit = Integer.parseInt(br.readLine());

        int[] fruit = new int[size];
        for(int i=0;i<size;i++){
            fruit[i] = Integer.parseInt(ar[i]);
        }
        br.close();;
    }
}
