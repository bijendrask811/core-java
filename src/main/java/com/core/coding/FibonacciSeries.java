package com.core.coding;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 5;

        int first = 0;
        int sec = 1;
        System.out.print(first+", ");
        System.out.print(sec+", ");
        for(int i =0;i<num;i++){
            int nexNo = first + sec;
            first = sec;
            sec= nexNo;
            System.out.print(sec+", ");

        }
    }
}
