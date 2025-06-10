package com.core.pattern.strategy;

public class CardPayment implements Payment{
        @Override
        public void pay(int amount) {
            System.out.println("Pay amount using card");
        }
}
