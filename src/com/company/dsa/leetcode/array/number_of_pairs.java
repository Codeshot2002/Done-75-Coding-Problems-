package com.company.dsa.leetcode.array;

public class number_of_pairs {
    static long countPairs(int x[], int y[], int M, int N)
    {
        long res = 0;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(Math.pow(x[i],y[j]) > Math.pow(y[j],x[i])){
                    res++;
                }
            }
        }
        return res;
    }
    static long countPairs2(int x[], int y[], int M, int N)
    {
        long res = 0;
        int i,j;
        i = j = 0;
        while(i<M){

        }
        return res;
    }
    public static void main(String[] args) {

    }
}
