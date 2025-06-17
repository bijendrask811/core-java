package com.core.array;

import java.util.HashMap;
import java.util.Map;

public class FindFirstMinOccurChar {
    public static void main(String[] args) {
        String str= "aabccdeff";

        //b
        char[] ch = str.toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        for(char i : ch){
            map.put(i,map.getOrDefault(i, 0) +1);
        }
        for(char c : ch){
            if(map.get(c) == 1){
                System.out.println("Min repeating char :"+c);
                break;
            }
        }

    }
}
