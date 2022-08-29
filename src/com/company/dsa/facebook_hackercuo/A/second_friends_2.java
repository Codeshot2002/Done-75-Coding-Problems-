package com.company.dsa.facebook_hackercuo.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class second_friends_2 {
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
                tree[i][j] = "^";
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
        else if(r==1 || c==1 && !tree_present(trees,r,c)){
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
            fillTrees(trees,r,c);
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
