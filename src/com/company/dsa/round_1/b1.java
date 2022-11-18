package com.company.dsa.round_1;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class b1 {
    static void func(int ntrees, long[][] tree, int nwells, long[][] wells){
        /*
        BigInteger res = new BigInteger("0");
        BigInteger xW,yW,xT,yT,sol1,sol2;
        for(int i=0;i<nwells;i++){
            xW = new BigInteger(String.valueOf(Math.abs(wells[i][0])));
            yW = new BigInteger(String.valueOf(Math.abs(wells[i][1])));
            BigInteger p = new BigInteger("0");
            for(int j=0;j<ntrees;j++){
                yT = new BigInteger(String.valueOf(Math.abs(tree[j][1])));
                sol1 = new BigInteger(String.valueOf(xW.subtract(xT).pow(2)));
                sol2 = new BigInteger(String.valueOf(yW.subtract(yT).pow(2)));
                p.add(sol1.add(sol2));
            }
            res.add(p);
        }

         */
    }
    public static void main(String[] args)throws IOException {
        String location = "F:\\DSA with java course\\Round1_meta_hackercup\\B1";
        String input_filename = "input";
        BufferedWriter bw = new BufferedWriter(new FileWriter(location + "\\output.txt"));
        BufferedReader br = new BufferedReader(new FileReader(location + "\\" + input_filename + ".txt"));
        int t = Integer.parseInt(br.readLine());
        int k = 1;
        while(t-- > 0){
            int q = 0;
            int p = 0;
            int ntrees = Integer.parseInt(br.readLine());
            long[][] tree = new long[ntrees][2];
            while(q<ntrees){
                String[] treesCordinates = br.readLine().split(" ");
                for(int i=0;i<treesCordinates.length;i++){
                    tree[q][i] = Long.parseLong(treesCordinates[i]);
                }
                q++;
            }
            int nWells = Integer.parseInt(br.readLine());
            long[][] well = new long[nWells][2];
            while(p<nWells){
                String[] wellCordinates = br.readLine().split(" ");
                for(int j=0;j<wellCordinates.length;j++){
                    well[p][j] = Long.parseLong(wellCordinates[j]);
                }
                p++;
            }
            //System.out.println("Case #" + k + ": " +func(ntrees,tree,nWells,well) +  "\n");
            //bw.write("Case #" + k + ": " +func(ntrees,tree,nWells,well) +  "\n");
            k++;
        }
        bw.close();
        br.close();
    }
}
