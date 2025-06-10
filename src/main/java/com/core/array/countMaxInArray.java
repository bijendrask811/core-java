package com.core.array;

public class countMaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,0,9,8,5,6};

        int max =-199999;

        int i=0;
        while(i<arr.length){
            if(arr[i]>max){
                max= arr[i];
            }
            i++;
        }
        System.out.println(max);
    }
}
