package com.example.demo.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class FlowerBucket {
    private Flower flower;
    private int amount;
    private int price;
}
