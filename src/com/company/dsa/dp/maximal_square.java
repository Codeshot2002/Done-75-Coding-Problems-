package com.company.dsa.dp;

public class maximal_square {
    static boolean check(char[][] mat, int rs,int re, int cs, int ce){
        for(int i=rs;i<=re;i++){
            for(int j=cs;j<=ce;j++){
                if(mat[i][j] == '0') return false;
            }
        }
        return true;
    }

    public static int maximalSquare(char[][] matrix) {
        int max = Integer.MIN_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == '1'){
                    //start increasing the square;
                    int area = 1;
                    int i1 = i+1;
                    int j1 = j+1;
                    while(i1 < n && j1 < m && check(matrix,i,i1,j,j1)){
                        area = (i1-i) + 1;
                        area *= area;
                        i1++;
                        j1++;
                    }
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        char[][] mat = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        System.out.println(maximalSquare(mat));
    }
}
