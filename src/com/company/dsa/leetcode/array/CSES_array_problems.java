package com.company.dsa.leetcode.array;

import java.util.Arrays;

public class CSES_array_problems {
    //-----------Weird Algorithm problem 1----------
    //Using recursion
    static void algo(int n){
        if(n==1){
            System.out.print(" " + n);
            return;
        }
        else{
            if(n%2==0){
                System.out.print(n + " ");
                algo(n/2);
            }
            else{
                System.out.print(n + " ");
                algo((n*3)+1);
            }
        }
    }
    //Iterative
    static void algo2(int n){
        while(n!=1){
            System.out.print(n + " ");
            if(n%2==0){
                n /= 2;
            }
            else{
                n = (n*3) + 1;
            }
        }
        System.out.println(n);
    }

    //Problem 2----------Missing number
    static int missingnum(int[] arr,int size){
        Arrays.sort(arr);
        int j = 0;
        for(int i=arr[0];i<arr[arr.length-1];i++){
            if(arr[j] != i){
                return i;
            }
            j++;
        }
        return -1;
    }

    //Problem 3 ------------ repetitions
    static int rep(char[] a){
        int max = 0;
        for(int i=0;i<a.length;i++){
            int count = 1;
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j]){
                        count++;
                }
                else{
                    break;
                }
            }
            if(count > max){
            max = count;
            }
        }
        if(max > 1){
            return max;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
//        algo2(3);
//        int[] a = {2,3,1,5};
//        int size = 5;
//        System.out.println(missingnum(a,5));
        char[] a = {'A','T','T','C','G','G','G','A','A','A','A'};
        System.out.println(rep(a));
    }
}
