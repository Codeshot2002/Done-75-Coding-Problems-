package com.company.dsa.facebook_hackercuo.D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class flght {
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
            k++;
        }
    }
}
