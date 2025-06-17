package com.core.array;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatingNo {


    public static void main(String[] args) {

        Map<Integer,Integer> checkMap = new HashMap<>();

        int[] arr = {1,5,3,4,3,5,6};

        int minInddex = Integer.MAX_VALUE;
        int checkIndex = 0;
        for(int i =0;i<arr.length;i++){
            if(!checkMap.containsKey(arr[i])){
                checkMap.put(arr[i],i);
            }
            else{
                checkIndex = checkMap.get(arr[i]);
                if(checkIndex < minInddex){
                    minInddex = checkIndex;
                }
            }
        }
        System.out.println(minInddex);


    }
}
