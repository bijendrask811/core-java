package com.core.array;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2};

        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                count +=arr[j];
                System.out.println(arr[j]+" ->"+count);
            }
        }
    }
}
