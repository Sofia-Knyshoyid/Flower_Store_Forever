package com.example.demo.delivery;

import java.util.LinkedList;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public void deliver(LinkedList items) {
        System.out.println("___DHL Delivery Strategy used___");
    }
}
