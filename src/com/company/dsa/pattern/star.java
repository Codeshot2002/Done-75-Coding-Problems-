package com.company.dsa.pattern;

public class star {
    static void box(String s,int k){
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                System.out.print(s);
            }
            System.out.println();
        }

    }

    static void boxR(String s, int i,int j){
        if(i==4 && j == 4) return;
        if(i == 5 ){
            System.out.println();
            boxR(s,1,j+1);
        }
        if(i<5){
            System.out.print(s);
            boxR(s,i+1,j);
        }
    }

    static void countingTri(int s,int k){
        for(int i=k;i>0;i--){
            for(int j=i-1;j<k;j++){
                System.out.print(s++ + " ");
            }
            System.out.println();
            s = 1;
        }
    }
    static void bow(String s, int k){
        for(int i=0;i<k;i++){
            for(int j=k-i;j<=k;j++){
                System.out.print(s);
            }
            System.out.println();
        }
        for(int i=0;i<k-1;i++){
            for (int j=i;j<k-1;j++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //box("*",5);
       // boxR("*",0,0);
        countingTri(1,5);
        System.out.println();
        bow("*",5);
    }
}
