package com.core.coding;

public class CheckPrimeNoOrNot {

    public static void main(String[] args) {


        int num = 21;

        boolean flag = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Prime No");
        }else{
            System.out.println("Not a Prime");
        }

    }
}
