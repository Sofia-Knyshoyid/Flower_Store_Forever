package com.example.demo.item;

public class RomashkaFlower extends Item {
    public String description = " a romashka flower ";
    public int price = 20;

    @Override
    public double price() {
        return price * 2;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
