package com.company.dsa;

public class Main {
    static  boolean isPalindrome(int x) {
        int n = 0;
        int n1 = x;
        while(x>0){
            n = n*10 + x%10;
            x /= 10;
        }
        if(n==n1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
