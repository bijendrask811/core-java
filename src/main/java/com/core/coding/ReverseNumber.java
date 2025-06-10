package com.core.coding;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 4321;

        int reverseNo = 0;
        while(num>0){
            int lastDigit = num % 10;
            reverseNo = reverseNo*10 + lastDigit;
            num = num/10;
        }
        System.out.println(reverseNo);

    }

}
