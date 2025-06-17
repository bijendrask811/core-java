package com.core.array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,4,5};
        int j =0;
        for(int i =1;i<arr.length;i++){
            if(arr[j] != arr[i]){
                arr[++j] = arr[i];

            }
        }

        for(int i=0;i<j;i++){
        System.out.println(arr[j]);
        }
    }
}
