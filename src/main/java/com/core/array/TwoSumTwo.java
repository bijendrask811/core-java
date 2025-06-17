package com.core.array;

public class TwoSumTwo {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int outPut = 9;
        int j = arr.length -1;
        int i =0;
        while(i<j){
            if(arr[i] + arr[j] < outPut){
                i++;
            }else if(arr[i] + arr[j] > outPut){
                j++;
            }else{
                System.out.println(i + " and " + j);
            }
        }
    }

}
