package com.example.demo.payment;

public class NavigatePayment {
    private Payment payment;

    public void setPaymentMethod(Payment payment){
        this.payment = payment;
    }

    public void PayWithChosenMethod(double price){
        payment.pay(price);
    }

}
