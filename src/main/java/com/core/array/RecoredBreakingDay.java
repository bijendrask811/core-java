package com.core.array;

public class RecoredBreakingDay {
    public static void main(String[] args) {
         int[] arr = {1,2,0,7,2,1,2,9};

         int max = 0;
         int recordBreakDay = 0;
         int i=0;
         while(i<arr.length){
             if(i==arr.length-1 && arr[i] > max){
                 recordBreakDay = i;
                 break;
             }
             if( arr[i]>max && arr[i+1]<arr[i]){
                 max = arr[i];
                 recordBreakDay = i;
             }
             i++;
         }
        System.out.println(recordBreakDay);
     }
}
