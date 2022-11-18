package com.company.dsa.sorting_searching_questions;

import java.util.Arrays;
import java.util.HashSet;

public class problems {
    //using hashmap
    static int distinct_numbers(int[] array){
        HashSet<Integer> hs = new HashSet<>();   //O(1)
        for(int x : array){     //O(n)
            hs.add(x);
        }
        return hs.size();   //O(1)
    } //Time complexity : O(n)


    //Problem 2 ----------- Apartments
    static int apartments(int[] a, int[] r){
        int count = 0;
        int available = 0;
        for(int i=0;i<a.length;i++){      //O(n)
            available = a[i];
            for(int j = i;j<r.length;j++){    //O(M)
                if(available >= r[j]){
                    available -= r[i];
                    count ++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }//Time complexity : O(N+M)
    public static void main(String[] args) {
        int[] a = {2,3,2,2,3,3,3,5,4};
        System.out.println(distinct_numbers(a));

        int[] available = {90,30,45};
        int[] Requirement = {30,30,60};
        System.out.println(apartments(available,Requirement));
    }
}
