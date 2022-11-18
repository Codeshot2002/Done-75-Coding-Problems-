package com.company.dsa.round_1;

import java.io.*;

public class a3 {
    static String func(){
        return "Yes";
    }
    public static void main(String[] args)throws IOException {
        String location = "F:\\DSA with java course\\Round1_meta_hackercup\\A1";
        String input_filename = "input";
        BufferedWriter bw = new BufferedWriter(new FileWriter(location + "\\output.txt"));
        BufferedReader br = new BufferedReader(new FileReader(location + "\\" + input_filename + ".txt"));
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
                for(int j=0;j<c-1;j++)
                {
                    trees[i][j] = String.valueOf(ch[j]);
                }
            }
            bw.write("Case #" + k + ": " +func() +  "\n");
            k++;
        }
        bw.close();
        br.close();
    }
}
