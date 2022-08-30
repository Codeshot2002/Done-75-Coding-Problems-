package com.company.dsa.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class check_den_num {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = br.readLine().split(" ");
        if((Integer.parseInt(ar[0]) > Integer.parseInt(ar[1])))
        {
            System.out.println(Integer.parseInt(ar[0]));
        }
        else{
            System.out.println(Integer.parseInt(ar[1]));
        }
    }
}
