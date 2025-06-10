package com.core.pattern.strategy;

public class PaymentContext {
    private Payment payment;

    public void setPaymentContext(Payment payment){
        this.payment = payment;

    }

    public void amountToBePayed(int amount){
        payment.pay(amount);
    }

}
