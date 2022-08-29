package com.company.dsa.facebook_hackercuo.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class second_friend {
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

    static void set_tree(String[][] tree, int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(tree[i][j].equals("^")){
                    int count = adjacents(tree,r,c,i,j);
                    while(count < 3){
                        if(checkleft(r,c,i,j) && tree[i][j].equals(".")){
                            tree[i][j-1] = "^";
                        }
                        else if(checkRight(r,c,i,j) && tree[i][j].equals(".")){
                            tree[i][j+1] = "^";
                        }
                        else if(checkbot(r,c,i,j) && tree[i][j].equals(".")){
                            tree[i+1][j] = "^";
                        }
                        else if(checktop(r,c,i,j) && tree[i][j].equals(".")){
                            tree[i-1][j] = "^";
                        }
                        count++;
                    }
                }
            }
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

    static String tree(String[][] trees, int r, int c){
        if(r>0 && c>0){
            if(c==1 && tree_present(trees,r,c)){
                StringBuilder str = new StringBuilder();
                str.append("Impossible\n");
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
            else if(r==1 && tree_present(trees,r,c)){
                StringBuilder str = new StringBuilder();
                str.append("Impossible\n");
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
            else if(!tree_present(trees,r,c)){
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
            else{
                for(int i=0;i<r;i++){
                    for(int j=0;j<c;j++){
                        set_tree(trees,i,j);
                    }
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
        else {
            return "Impossible";
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
                for(int j=0;j<c;j++){
                    trees[i][j] = String.valueOf(ch[j]);
                }
            }
            System.out.println("Case #" + k + ": " +tree(trees,r,c));
            k++;
        }
    }
}
