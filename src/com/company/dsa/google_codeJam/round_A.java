package com.company.dsa.google_codeJam;
import javax.security.auth.callback.ChoiceCallback;
import java.util.*;
public class round_A {

    static String function(int[] ar,List<String> list) {

        //adding distinct chars in the list
        char[] chars = new char[26];
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).length();j++){
                char c = list.get(i).charAt(j);
                c = Character.toLowerCase(c);
                int pos = c - 'a';
                if(chars[pos] == 0){
                    chars[pos] = c;
                }
            }
        }

        //mapping values
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<chars.length;i++){
            if(chars[i] != 0){
                map.put(chars[i], ar[i]);
            }
        }

        //form encoded combinations
        List<String> encoded = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            String num = "";
            String temp = list.get(i);
            for(int j=0;j<temp.length();j++){
                num += map.get(Character.toLowerCase(temp.charAt(j)));         //adding the value stored in the map
            }
            if(!encoded.contains(num)){
                encoded.add(num);
            }else{
                return "Case #2: YES";
            }
        }
        return "Case #1: NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[] ar = new int[26];
            for(int i=0;i<ar.length;i++){
                ar[i] = sc.nextInt();
            }
            int size = sc.nextInt();
            List<String> in = new ArrayList<>();
            for(int i=0;i<size;i++){
                in.add(sc.next());
            }
            System.out.println(function(ar,in));
        }
    }

}
