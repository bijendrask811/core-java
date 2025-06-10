package com.core.searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int find = 65;
        int[] arr = {34,32,65,78,99};

        Arrays.sort(arr);
        int s = 0;
        int e = arr.length - 1;

        while(s<=e) {
            int midIndex = (s+e) / 2;
            if (arr[midIndex] == find) {
                System.out.println(arr[midIndex]);
                break;
            } else if (arr[midIndex] < find) {
                e = midIndex -1;
            } else {
               s = midIndex+1;
            }
        }

    }


}
