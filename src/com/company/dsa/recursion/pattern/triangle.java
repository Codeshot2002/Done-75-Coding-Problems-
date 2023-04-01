package com.company.dsa.recursion.pattern;

import java.util.ArrayList;
import java.util.List;

public class triangle {
    public static void main(String[] args) {

    }
    static void triFunction(int r,int c){
        if(r == 0) return;
        if(c < r){
            triFunction(r,c + 1);
            System.out.print("*");
        }else{
            triFunction(r-1,0);
            System.out.println();
        }

    }
}

