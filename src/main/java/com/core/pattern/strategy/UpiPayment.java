package com.core.pattern.strategy;


    public class UpiPayment implements Payment{

        @Override
        public void pay(int amount) {
            System.out.println("Pay amount using UPI"+amount);
        }
    }



