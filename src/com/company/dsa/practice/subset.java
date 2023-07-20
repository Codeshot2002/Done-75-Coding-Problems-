package com.company.dsa.practice;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        String a = "abcd";
        System.out.println(sub(a));

        int[] ar = {0,1,0,3,2,3};
        System.out.println(subI(ar));


        //diece problem
        List<String> list = new ArrayList<>();
        diceTarget("",5,list,3);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("---------");
        int[] ar1 = {1, 3, 1, 2, 5};
        System.out.println(maxSum(ar1));
    }

    static List<List<String>> sub(String a) {
        List<List<String>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i=0;i<a.length();i++){
            int n = outer.size();
            for(int j=0;j<n;j++){
                List<String> inner = new ArrayList<>(outer.get(j));
                inner.add(String.valueOf(a.charAt(i)));
                outer.add(inner);
            }
        }
        return outer;
    }
    static int subI(int[] ar) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int max = -1;
        List<Integer> out = new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            int n = outer.size();
            for(int j=0;j<n;j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                if(inner.isEmpty()){
                    inner.add(ar[i]);
                    outer.add(inner);
                }else {
                    if(ar[i] > inner.get(inner.size()-1)){
                        inner.add(ar[i]);
                        outer.add(inner);
                    }
                }
                if(inner.size() > max){
                    out = inner;
                    max = inner.size();
                }
            }
        }
        System.out.println(out);
        return max;
    }

    //dice and target sum
    static void diceTarget(String p,int target, List<String> list,int face){
        if(target == 0){
            list.add(p);
            return;
        }
        for(int i=1;i<=face && i<=target;i++){
            diceTarget(p + " " +i,target-i,list,face);
        }
    }

    static int maxSum(int[] ar){
        if(ar.length == 1) return ar[0];
        int max = 0;
        for(int i=ar.length-1;i>=0;i--){
            if (ar[i] > ar[i - 1]) {
                max += ar[i];
                i--;
                if(i == 2) {
                    max += ar[0];
                    return max;
                }
            } else {
                max += ar[i - 1];
                if(i==1){
                    return max;
                }
            }

        }
        return max;
    }
}
