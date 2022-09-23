package com.company.dsa.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class cheat_question {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        while(t-- > 0){
            Integer element = 0;
            String[] input = br.readLine().split(" ");
            if(input.length>1){
                element = Integer.parseInt(input[1]);
                queue.add(element);
            }
            else if(Integer.parseInt(input[0]) == 2){
                //dequeue
                queue.remove();
            }
            else if(Integer.parseInt(input[0]) == 3){
                //print
                queue.peek();
            }
        }
    }
}
