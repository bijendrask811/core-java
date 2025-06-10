package com.core.pattern.strategy;

public class CashPayment implements Payment{
        @Override
        public void pay(int amount) {
            System.out.println("Pay amount using cash");
        }
    }


