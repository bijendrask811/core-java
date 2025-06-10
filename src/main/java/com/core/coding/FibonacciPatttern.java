package com.core.coding;

public class FibonacciPatttern {
    public static void main(String[] args) {
// Fibonacci Star Pattern
//*
//*
//**
//***
//*****
//********
//*************

        int num = 6;

        int first = 0;
        int sec = 1;

        System.out.println("* ");
        for(int i=0;i < num;i++){

            int fiboNo = first +sec;
            first = sec;
            sec = fiboNo;
            System.out.println("*".repeat(fiboNo));
        }

    }
}
