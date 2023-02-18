package com.company.dsa.leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class longest_repeating_character {
    static int characterReplacement(String s, int k){
        int left = 0; int right = 0; int max = 0; int max_repeat = 0;
        Map<Character,Integer> fmap = new HashMap<>();
        while(right < s.length()){     //o(n)
            fmap.put(s.charAt(right), fmap.getOrDefault(s.charAt(right),0) + 1);     //o(1)
            max_repeat = Math.max(max_repeat, fmap.get(s.charAt(right)));    //o(1)

            //Condition is not valid for the window
            if(right - left + 1 - max_repeat > k){
                fmap.put(s.charAt(left), fmap.get(s.charAt(left))-1);        //o(1)
                left++;
            }
            max = Math.max(max,right - left + 1);            //o(1)
            right++;
        }
        return max;
    }

    //my approach
    static int characterReplacement2(String s, int k){
        int left = 0; int right = 0; int max = 0; boolean flag = true;
        int count = 0;
        while(left < s.length()){

            while(right < s.length()){
                Character c = s.charAt(right);
                if(s.charAt(left) == c && left > 0){
                    if(flag){
                        max = Math.max(max,right - left + 1);
                    }
                    flag = true;
                }
                else{
                    flag = false;
                    if(s.charAt(left) != c){
                        if(count < k){
                            count ++;
                            max = Math.max(max,right-left+1);
                            flag = true;
                        }else{
                            break;
                        }
                    }
                }
                right++;
            }
            if(max == s.length()){
                return max;
            }
            count = 0;
            left++;
            right = left;
        }
         return max;
    }

    public static void main(String[] args) {
        String input = "ABBB";
        System.out.println(characterReplacement(input,1));
    }
}
