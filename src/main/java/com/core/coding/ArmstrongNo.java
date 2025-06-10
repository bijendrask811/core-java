package com.core.coding;

public class ArmstrongNo {
    public static void main(String[] args) {

        int no = 153;
        int originalNo = no;
        int armsNo = 0;

        while(no>0){

            int singDigit = no%10;
            armsNo += (int) Math.pow(singDigit,3);

            no = no/10;
        }

        if(originalNo == armsNo){
            System.out.println("Armstrong no : "+armsNo);
        }else {
            System.out.println("Not a armstrong no : "+originalNo);
        }
    }
}
