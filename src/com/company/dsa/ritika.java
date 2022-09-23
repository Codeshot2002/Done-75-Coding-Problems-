package com.company.dsa;
public class ritika {
    static int square(int val){
        return val*val;
    }
    static int multiply(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        int age = 30;
        double b = 10.5;
        boolean ritikaLovesMe = true;
        String myLove = "Ritika";
        char r = 'r';
        //COnditionals operators
        if (age < 40) {
            System.out.println("age is less than 40");
        } else {
            System.out.println("age is more than 40");
        }

        // for loops
        /*
        for (int i = 1; i <=100; i++) {
            System.out.println(i);
        }
        int l = 0;
        while(l<100){
            System.out.println(l);
            l++;
        }

         */
        int ritkaval = 52;
        int answer = square(ritkaval);
        System.out.println(answer);

    }
}