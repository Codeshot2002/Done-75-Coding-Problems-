package com.company.dsa.Sharda_Competition;
import java.util.*;
public class Climbing_the_leaderboard {
    static List<Integer> removeDup(List<Integer> rank){
        List<Integer> res =new ArrayList<>();
        for(int i=0;i<rank.size();i++){
            if(!res.contains(rank.get(i))){
                res.add(rank.get(i));
            }
        }
        return res;
    }
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> newRank = removeDup(ranked);
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = newRank.size() - 1;
        while(i<player.size()){
            if(player.get(i) < newRank.get(j)){
                res.add(j+2);
            }
            else {
                while(player.get(i) > player.get(j) && j >= 0){
                    j--;
                }
                res.add(j + 1);
            }
            i++;j--;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(climbingLeaderboard(Arrays.asList(rank)), );
    }

}
