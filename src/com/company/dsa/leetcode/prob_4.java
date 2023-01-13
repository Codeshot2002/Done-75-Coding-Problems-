package com.company.dsa.Leetcode;

import java.util.ArrayList;
import java.util.Collections;

//Median of two SOrted Array     DIFF:  HARD
public class prob_4 {
    static double median(int[] ar1,int[] ar2){
        double med = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(Integer a:ar1){
            arrayList.add(a);
        }
        for(Integer b:ar2){
            arrayList.add(b);
        }
        Collections.sort(arrayList);
        if(arrayList.size() % 2 == 1){
            med = arrayList.get((int)arrayList.size()/2);
        }
        else {
            med = ((double) arrayList.get((arrayList.size()/2)-1)+ (double)arrayList.get(arrayList.size()/2))/2;
        }
        return med;
    }
    public static void main(String[] args) {
        int[] ar1 = {1,3};
        int[] ar2 = {2};
        System.out.println(median(ar1,ar2));
    }
}
