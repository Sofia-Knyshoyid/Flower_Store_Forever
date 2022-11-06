package com.example.demo.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public void pay(double price) {
        System.out.println(String.format("Paid the sum: %f with Credit Card", price));
    }
}
