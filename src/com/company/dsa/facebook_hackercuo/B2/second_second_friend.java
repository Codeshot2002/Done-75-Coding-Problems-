package com.company.dsa.facebook_hackercuo.B2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class second_second_friend {
    static int adjacents(String[][] tree,int r, int c,int i, int j){
        int count = 0;
        if(checkleft(r,c,i,j)){
            if(tree[i][j].equals("^")){
                if(tree[i][j-1].equals("^")){
                    count++;
                }
            }
        }
        if(checkRight(r,c,i,j)){
            if(tree[i][j].equals("^")){
                if(tree[i][j+1].equals("^")){
                    count++;
                }
            }

        }
        if(checktop(r,c,i,j)){
            if(tree[i][j].equals("^")){
                if(tree[i-1][j].equals("^")){
                    count++;
                }
            }
        }
        if(checkbot(r,c,i,j)) {
            if (tree[i][j].equals("^")){
                if (tree[i + 1][j].equals("^")) {
                    count++;
                }
            }
        }
        return count;
    }
    static boolean checkleft(int r,int c,int i, int j){
        if(j==0){
            return false;
        }
        else{
            return true;
        }
    }
    static boolean checkRight(int r,int c,int i, int j){
        if(j == (c-1)){
            return false;
        }
        else{
            return true;
        }
    }
    static boolean checktop(int r,int c,int i, int j){
        if (i == 0) {
            return false;
        }
        else{
            return true;
        }
    }
    static boolean checkbot(int r,int c,int i, int j){
        if(i == (r-1)){
            return false;
        }
        else{
            return true;
        }
    }



    static boolean tree_present(String[][] trees,int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(trees[i][j].equals("^")){
                    return true;
                }
            }
        }
        return false;
    }
    static void fillTrees(String[][] tree, int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(tree[i][j].equals(".")){
                    tree[i][j] = "^";
                }
            }
        }
    }
    static String tree(String[][] trees,int r, int c){
        if(r==1 || c == 1){
            if(tree_present(trees,r,c)){
                return "Impossible";
            }else{
                StringBuilder str = new StringBuilder();
                str.append("Possible\n");
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        str.append(trees[i][j]);
                    }
                    if(i<r-1){
                        str.append("\n");
                    }
                }
                return str.toString();
            }
        }
        else{
            fillTrees(trees,r,c);
            int flag = 10000;
            while(flag>0) {
                int[][] count = new int[r][c];
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        count[i][j] = adjacents(trees, r, c, i, j);
                    }
                }
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        if (count[i][j] == 1) {
                            trees[i][j] = ".";
                        }
                    }
                }
                flag--;
            }
            StringBuilder str = new StringBuilder();
            str.append("Possible\n");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    str.append(trees[i][j]);
                }
                if(i<r-1){
                    str.append("\n");
                }
            }
            return str.toString();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int k = 1;
        while(t-- > 0){
            String[] RandC = br.readLine().split(" ");
            int r = Integer.parseInt(RandC[0]);
            int c = Integer.parseInt(RandC[1]);
            String[][] trees = new String[r][c];
            for(int i=0;i<r;i++){
                String line =  br.readLine();
                char[] ch = line.toCharArray();
                for(int j=0;j<c;j++)
                {
                    trees[i][j] = String.valueOf(ch[j]);
                }
            }
            System.out.println("Case #" + k + ": " +tree(trees,r,c));
            k++;
        }
    }
}
