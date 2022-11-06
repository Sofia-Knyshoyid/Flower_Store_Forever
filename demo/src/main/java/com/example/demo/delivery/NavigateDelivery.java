package com.example.demo.delivery;

import java.util.LinkedList;

public class NavigateDelivery {
    private Delivery delivery;

    public void setDeliveryMethod(Delivery delivery){
        this.delivery = delivery;
    }

    public void PayWithChosenMethod(LinkedList items){
        delivery.deliver(items);
    }

}