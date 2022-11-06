package com.example.demo.item;

public class CactusFlower extends Item {
    public String description = " a cactus flower ";
    public int price = 13;

    @Override
    public double price() {
        return price*2;
    }

    @Override
    public double getPrice(){
        return price;
    }
}
