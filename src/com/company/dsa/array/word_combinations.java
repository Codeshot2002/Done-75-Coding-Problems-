package com.company.dsa.array;

public class word_combinations {
    static boolean same(String main, String sub){
        boolean flag = false;
        for(int i=0;i<sub.length();i++){
            if(sub.charAt(i) == main.charAt(i)){
                flag = true;
            }
            else{
                flag = false;
            }
        }
        return flag;
    }
    static int combination(String word, String[] dict, int len){
        int comb = 0;
        for(int i=0;i<len;i++){
            if(same(word,dict[i])){
                for(int k=0;k<len;k++){

                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String word = "umang";
        String c = "uman";
        System.out.println(same(word,c));
    }
}
