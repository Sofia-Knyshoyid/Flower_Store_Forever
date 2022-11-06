package com.example.demo.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path="/api/vi/payment")
public class PaymentController {
    @GetMapping
    public List<? extends Payment> getPayment(){
        return Arrays.asList(new CreditCardPaymentStrategy(), new PayPalPaymentStrategy());
    }

}