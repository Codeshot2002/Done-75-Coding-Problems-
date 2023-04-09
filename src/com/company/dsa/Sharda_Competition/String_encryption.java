package com.company.dsa.Sharda_Competition;

public class String_encryption {
    public static String encryption(String s) {
        // Write your code here
        s = s.replaceAll("\\s+", " ");
        int len = s.length();
        double a = Math.floor(Math.sqrt(len));
        double b = Math.ceil(Math.sqrt(len));
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        if(a*b < len){
            a = b;
        }
        char[][] ar = new char[(int)a][(int)b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(s.length() > j){
                    ar[i][j] = s.charAt(j);
                }
            }
            if(s.length() >= b){
                s = s.substring((int)b);
            }else{
                break;
            }
        }
        String res = "";
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                if(ar[j][i] != 0){
                    res += ar[j][i];
                }
            }
            res += " ";
        }
        return res.trim();
    }
}
