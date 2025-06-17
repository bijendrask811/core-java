package com.core.array;

import java.util.HashMap;

public class CheckSumOfSubArray {
    public static void main(String[] args) {

        int[] nums = {9, 4, 0, 20, 3, 10, 5};
        int k = 33;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0, 1);
        for (int i :nums) {
            sum +=i;
            if(k == sum){
                count++;
            }
            int noOfOccur=map.getOrDefault(sum-k,0);
            count+=noOfOccur;
            int valueUsingKey = map.getOrDefault(sum,0)+1;
            map.put(sum,valueUsingKey);
        }
        System.out.println(count);
        }
    }