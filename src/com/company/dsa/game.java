package com.company.dsa;

import com.sun.source.doctree.ThrowsTree;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();Scanner sc =new Scanner(System.in);
        String n1 = "";
        String n2 = "";
        int s1 = 0;
        int s2 = 0;
        int k = 1;
        int r = -1;
        while(true) {
            if(n1.isEmpty()){
                System.out.println("-------Guess the number------");
                System.out.println("Type the number between 0-10");
                System.out.print("Player 1 name : ");
                n1 = sc.nextLine();
                System.out.print("Player 2 name : ");
                n2 = sc.nextLine();
                Thread.sleep(1500);
            }
            for (int i = 0; i < 3; i++) {
                r = rand.nextInt(10);
                System.out.println("-----------ROUND "+ k++ + "-------------");
                int p1 = 0;
                int p2 = 0;
                System.out.println("(" + n1.toUpperCase() + " turn)");
                while (true) {
                    System.out.print("Your Guess : ");
                    int g = sc.nextInt();
                    p1++;
                    if (g == r) {
                        System.out.println("Right guess!");
                        break;
                    }else if(g < r){
                        System.out.println("Go higher!");
                    }else {
                        System.out.println("Go lower!");
                    }
                }
                Thread.sleep(1500);
                System.out.println();
                System.out.println("---------" + n2.toUpperCase() + " turn---------");
                while (true) {
                    System.out.print("Your Guess : ");
                    int g = sc.nextInt();
                    p2++;
                    if (g == r){
                        System.out.println("Right guess!");
                        break;
                    }else if(g < r){
                        System.out.println("Go higher!");
                    }else {
                        System.out.println("Go lower!");
                    }
                }
                if (p1 < p2) {
                    System.out.println(n1 + " wins this round");
                    s1++;
                } else {
                    System.out.println(n2 + " wins this round");
                    s2++;
                }

                if (s1 == 2 || s2 == 2) {
                    System.out.println("-------------GAME OVER-------------");
                    break;
                }
            }
            k = 0;
            Thread.sleep(2000);
            if (s1 > s2) {
                System.out.println(n1 + " wins by " + s1 + " rounds out of 3");
            } else {
                System.out.println(n2 + " wins by " + s2 + " rounds out of 3");
            }
            Thread.sleep(3000);
        }
    }
}
