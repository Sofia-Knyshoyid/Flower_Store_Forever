package com.example.demo.flowers;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor
public class Flower {
    private String color;
    private int sepalLength;
    private int price;

    //wouldn't work for manually created constructor?
}
