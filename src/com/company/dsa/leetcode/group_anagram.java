package com.company.dsa.leetcode;

import java.lang.reflect.Array;
import java.time.temporal.ChronoField;
import java.util.*;

public class group_anagram {
    //approach 1 Compare all the hashmaps
     static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> out = new ArrayList<>();
        List<Map<Character,Integer>> allMaps = new ArrayList<>();
        //Creating all the maps of the strings and storing in allmaps
        for(int i=0; i<strs.length;i++){
            Map<Character, Integer> map = new HashMap<>();
            for(int j=0;j<strs[i].length();j++){
                map.put(strs[i].charAt(j), map.getOrDefault(strs[i].charAt(j),0) +  1);
            }
            allMaps.add(map);
        }
        int[][] ans = new int[allMaps.size()][allMaps.size()];
        for(int i=0;i<allMaps.size();i++){
            int k = 0;
            ans[i][k] = i;
            for(int j=i+1;j<allMaps.size();j++){
                if(allMaps.get(i).equals(allMaps.get(j))){
                    ans[i][k] = j;
                    k++;
                }
            }
        }
         System.out.println(Arrays.deepToString(ans));

        return out;
    }

    //approach 2 Sort all the strings
    static List<List<String>> groupAnagrams2(String[] strs){
         HashMap<HashMap<Character,Integer>, ArrayList<String>> allmaps = new HashMap();
         for(String str : strs){
             HashMap<Character,Integer> map = new HashMap<>();
             for(int i=0;i< str.length();i++){
                 Character c = str.charAt(i);
                 map.put(c, map.getOrDefault(c,0) + 1 );
             }
             //this will check weather the map already contains the map or not
             //if not then it will generate a arraylist of string and store the word it is iterating through
             if(allmaps.containsKey(map) == false){
                 ArrayList<String> list = new ArrayList<>();
                 list.add(str);
                 allmaps.put(map,list);
             }
             //if yes then it will grasp the list and add the current word it is iterating through
             else{
                 ArrayList<String> list = allmaps.get(map);
                 list.add(str);
             }

         }
        List<List<String>> out = new ArrayList<>();
        out.addAll(allmaps.values());
        return out;
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams2(strs));



//        String name = "Umang";
//        SortedSet<Character> set = new TreeSet<>();
//        for(int  i=0;i<name.length();i++){
//            set.add(name.charAt(i));
//        }
//        System.out.println(set);
    }
}
