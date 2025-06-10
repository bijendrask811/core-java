package com.core.array;

import java.util.Arrays;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] arr = new int[nums.length -k +1];
        int i =0;
        for(int num =0;num <=nums.length-k;num++){
            int max = -19999;
            for(int j = num;j<num+k;j++){
                if(max < nums[j]){
                    max = nums[j];
                }
            }
            arr[i] = max;
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
