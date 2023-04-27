package com.company.dsa.practice;

public class mrogan {
    public static String morganAndString(String a, String b) {
        // Write your code here
        int i = 0; int j = 0;
        String res = "";
        while(i < a.length() && j < b.length()){
            char x = a.charAt(i);
            char y = b.charAt(j);
            if(x <= y){
                res += x;
                i++;
            }
            else{
                res += b.charAt(j);
                j++;
            }
        }
        if(i<a.length()){
            res += a;
        }
        else if(j < b.length()){
            res += b.substring(j);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(morganAndString("JACK","DANIEl"));
    }
}
