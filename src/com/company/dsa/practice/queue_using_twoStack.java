package com.company.dsa.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class my_stack{
    private int[] array;
    private int top;
    public void createStack(int size){
        this.array = new int[size];
        top = -1;
        System.out.println("Stack of size " + size + " has been created!");
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(array.length -1 == top){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int data){
        if(isFull()){
            System.out.println("stack is full!");
        }
        else{
            top++;
            this.array[top] = data;
            System.out.println(data + " has been added to your stack");
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
        }
        else{
            int topItem = array[top];
            array[top] = 0;
            top--;
            System.out.println(topItem + " has been removed!");
        }
    }
    public void peek(){
        for(int i=0;i<=top;i++){
            System.out.println(array[i]);
        }
    }
}
public class queue_using_twoStack {
    static void transfer(Stack<Long> stack1, Stack<Long> stack2){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    static void enqueue(Stack<Long> stack1, long element){
        stack1.push(element);
    }
    static long dequeue(Stack<Long> stack1,Stack<Long> stack2){
        long val;
        transfer(stack1,stack2);
        val = stack2.pop();
        transfer(stack2,stack1);
        return val;
    }
    static long peak(Stack<Long> stack1, Stack<Long> stack2){
        transfer(stack1,stack2);
        long val = stack2.peek();
        transfer(stack2,stack1);
        return val;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(br.readLine());
        Stack<Long> stack1 = new Stack<>();
        Stack<Long> stack2 = new Stack<>();
        while(t-- > 0){
            long element = 0;
            String[] input = br.readLine().split(" ");
            if(input.length>1){
                element = Long.parseLong(input[1]);
                enqueue(stack1,element);
            }
            else if(Long.parseLong(input[0]) == 2){
                //dequeue
                dequeue(stack1,stack2);
            }
            else if(Long.parseLong(input[0]) == 3){
                //print
                System.out.println(peak(stack1,stack2));
            }
        }
    }
}
