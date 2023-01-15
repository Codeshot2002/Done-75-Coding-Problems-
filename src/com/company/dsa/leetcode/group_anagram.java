package com.company.dsa.leetcode;

import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class group_anagram {
     static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> out = new ArrayList<>();
        List<Map<Character,Integer>> allMaps = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        //Creating all the maps of the strings and storing in allmaps
        for(int i=0; i<strs.length;i++){
            Map<Character, Integer> map = new HashMap<>();
            for(int j=0;j<strs[i].length();j++){
                map.put(strs[i].charAt(j), map.getOrDefault(strs[i].charAt(j),0) +  1);
            }
            allMaps.add(map);
        }
        for(int i=0;i<allMaps.size();i++){
            int k = 0;
            for(int j=i+1;j<allMaps.size();j++){
                if(allMaps.get(i).equals(allMaps.get(j))){
                    ans.get(i).add(k,i);
                    k++;
                }
            }
        }


        return out;
    }
}
