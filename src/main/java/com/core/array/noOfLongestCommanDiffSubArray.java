package com.core.array;

public class noOfLongestCommanDiffSubArray {
    public static void main(String[] args) {
        int[] arr = {10,7,4,6,8,10,11};

        int maxNoOfSameDiff = 0;
        int secondHighest = 0;
        int checkDiff = 0;
        int i =1;
        while(i<arr.length){
            int diff = arr[i-1]- arr[i];
            if(diff == checkDiff){
                secondHighest++;
            }else{
                secondHighest = 0;
                checkDiff = diff;
                secondHighest++;
            }

            if(secondHighest > maxNoOfSameDiff){
                maxNoOfSameDiff = secondHighest;
            }

            i++;
        }
        System.out.println(maxNoOfSameDiff+1);
    }
}
