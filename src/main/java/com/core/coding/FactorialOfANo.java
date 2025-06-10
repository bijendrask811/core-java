package com.core.coding;

public class FactorialOfANo {

    public static void main(String[] args) {
        int no = 5;
        int fact = 1;
        for(int i =2;i<=no;i++){
            fact *=i;
        }

        System.out.println(fact);
    }
}
