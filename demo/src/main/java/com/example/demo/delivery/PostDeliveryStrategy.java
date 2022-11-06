package com.example.demo.delivery;

import java.util.LinkedList;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public void deliver(LinkedList items) {
        System.out.println("___Post Delivery Strategy used___");
    }
}
