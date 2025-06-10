package com.core.pattern.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentContext(new UpiPayment());
        paymentContext.amountToBePayed(8000);

        paymentContext.setPaymentContext(new CashPayment());
        paymentContext.amountToBePayed(3000);

        paymentContext.setPaymentContext(new CardPayment());
        paymentContext.amountToBePayed(5000);




    }
}
