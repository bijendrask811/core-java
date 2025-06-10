package com.core.coding;

public class PascalTriangle {
    public static void main(String[] args) {

        int noOfRow = 5;

        for(int i =0;i<noOfRow;i++){
            for(int j = 0;j<=i;j++){
                int no = fibo(i)/(fibo(i-j)*fibo(j));
                System.out.print(no+ " ");
            }
            System.out.println();
        }

    }

    private static int fibo(int i) {
        int result = 1;
        for(int j=2;j<=i;j++){
            result*=j;
        }
        return result;
    }
}
